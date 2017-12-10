package test;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

/**
 * Created by chenz on 2017/12/9.
 */
public class Echo extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x!");
        }).listen(8080);
        System.out.println("HTTP server started on port 8080");
    }


    public static void main(String[] a) throws Exception {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(Echo.class,new DeploymentOptions());
    }
}
