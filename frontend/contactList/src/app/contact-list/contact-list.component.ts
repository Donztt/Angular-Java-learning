import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-contact-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './contact-list.component.html',
  styleUrl: './contact-list.component.scss'
})
export class ContactListComponent {
  contatos: any[] = [
    {
      nome: 'João',
      telefone: '123456789',
      email: 'joao@example.com',
      cargo: 'Desenvolvedor',
      endereco: 'Rua A, 123'
    },
    {
      nome: 'Maria',
      telefone: '987654321',
      email: 'maria@example.com',
      cargo: 'Designer',
      endereco: 'Rua B, 456'
    },
  ]
}
