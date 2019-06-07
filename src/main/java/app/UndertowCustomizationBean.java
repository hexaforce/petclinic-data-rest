package app;

import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import io.undertow.Undertow.Builder;
import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.websockets.jsr.WebSocketDeploymentInfo;

@Component
public class UndertowCustomizationBean implements WebServerFactoryCustomizer<UndertowServletWebServerFactory> {

	@Override
	public void customize(UndertowServletWebServerFactory server) {

		server.addDeploymentInfoCustomizers(new UndertowDeploymentInfoCustomizer() {
			@Override
			public void customize(DeploymentInfo deploymentInfo) {
				@SuppressWarnings("unused")
				WebSocketDeploymentInfo info = new WebSocketDeploymentInfo();
				// deploymentInfo.addServletContextAttribute(WebSocketDeploymentInfo.ATTRIBUTE_NAME, info);
			}
		});

		server.addBuilderCustomizers(new UndertowBuilderCustomizer() {
			@Override
			public void customize(Builder builder) {
				// builder.addHttpListener(8080, "0.0.0.0");
			}
		});

	}

}