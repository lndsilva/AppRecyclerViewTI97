package br.com.local.apprecyclerviewti97;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {


    //Inflar ou instanciar os componentes no layout para serem inseridos no RecyclerView
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return null;
    }

    //Ligar os componentes do ViewHolder no RecycleView
    @Override
    public void onBindViewHolder(@NonNull @NotNull Adaptador.ViewHolder holder, int position) {

    }

    //Contar os itens que serão carregados no RecyclerView
    @Override
    public int getItemCount() {
        return 0;
    }

    //Carregar os componentes do modelo
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
