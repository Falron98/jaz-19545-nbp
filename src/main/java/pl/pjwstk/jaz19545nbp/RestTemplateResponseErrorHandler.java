package pl.pjwstk.jaz19545nbp;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@RestControllerAdvice
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return new DefaultResponseErrorHandler().hasError(clientHttpResponse);
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException
    {
        if (clientHttpResponse.getStatusCode()
                .series() == HttpStatus.Series.SERVER_ERROR) {
            if (clientHttpResponse.getStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR){
                throw new InternalServerErrorException();
            }

        } else if (clientHttpResponse.getStatusCode()
                .series() == HttpStatus.Series.CLIENT_ERROR) {
            if (clientHttpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new NotFoundException();
            }
            if (clientHttpResponse.getStatusCode() == HttpStatus.BAD_REQUEST) {
                throw new BadRequestException();
            }

        }

    }

}
