package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
     List<Language> getAll();

	void add(Language language);

	void delete(int id);

	void update(int id);

	

	List<Language> getById();
}
