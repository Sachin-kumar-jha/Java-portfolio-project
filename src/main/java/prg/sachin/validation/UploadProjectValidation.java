package prg.sachin.validation;

import javax.servlet.http.Part;

public interface UploadProjectValidation {
public String projectValidation(Part part);
public String resumeValidation(Part part);
}
