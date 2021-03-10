package br.com.api.ml.question;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.api.ml.product.Product;
import br.com.api.ml.user.User;

@Component
@Primary
public class PrintEmails implements Mailer {

	public void sendQuestion(@NotNull @Valid Question question, @NotNull @Valid Product product,
			@NotNull @Valid User user) {

		System.out.println("To: " + product.getUserEmail());
		System.out.println("From: " + user.getEmail());
		System.out.println("Title: " + question.getTitle());
		System.out.println("Subject: " + question.getTitle());
	}

}
