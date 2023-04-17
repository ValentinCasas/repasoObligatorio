package usuario.example.tpanexoa;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class LogginActivityViewModel extends AndroidViewModel {


    public LogginActivityViewModel(@NonNull Application application) {
        super(application);

    }
    private String usuario;
    private String contrasenia;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean Validado() {

        return usuario.equals("usuario") && contrasenia.equals("contraseña");
    }
}


