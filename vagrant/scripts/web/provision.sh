#!/bin/sh

# linux guest local ansible hack courtesy of https://github.com/vallarfax

ansible-playbook /vagrant/ansible/web/site.yml --connection=local -i "127.0.0.1," --verbose
