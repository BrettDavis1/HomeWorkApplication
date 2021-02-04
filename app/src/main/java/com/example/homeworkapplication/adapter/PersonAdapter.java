package com.example.homeworkapplication.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkapplication.databinding.ItemImageBinding;
import com.example.homeworkapplication.model.Person;

import java.util.List;

// TODO: 2/3/2021 Create adapter to take a List<Person>
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    private final List<Person> people;

    public PersonAdapter(List<Person> people) {
        this.people = people;
    }
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemImageBinding binding = ItemImageBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );
        return new PersonViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = people.get(position);
        holder.setPerson(person);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder {
        private final ItemImageBinding binding;

        public PersonViewHolder(@NonNull ItemImageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void setPerson(Person person) {
            binding.tvPpl.setText(person.toString());
        }
    }
}
