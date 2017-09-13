package com.example.alunos.listactivity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alunos.listactivity.model.Pessoa;

import java.util.List;

/**
 * Created by alunos on 13/09/17.
 */

public class PessoaAdapter extends BaseAdapter {

    private Context context;
    private List<Pessoa> lista;

    public PessoaAdapter(Context context, List<Pessoa> lista){
        this.context = context;
        this.lista = lista;
    }

    public int getCount(){
        return lista.size();
    }

    public Object getItem(int posicao){
        Pessoa obj = lista.get(posicao);
        return obj;
    }

    public long getItemId(int posicao){
        return posicao;
    }

    public View getView(int posicao, View convertView, ViewGroup parent){
        Pessoa obj = lista.get(posicao);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(android.R.layout.layout_agenda_pessoa, null);

        TextView textNome = (TextView) v.findViewById(android.R.id.textNome);
        textNome.setText(obj.getNome());

        TextView textTelefone = (TextView) v.findViewById(android.R.id.textTelefone);
        textTelefone.setText(obj.getTelefone());

        TextView textIdade = (TextView) v.findViewById(android.R.id.textIdade);
        textIdade.setText(obj.getIdade());

        return v;
    }
}
