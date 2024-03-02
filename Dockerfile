# base imgae from hub.docker
FROM httpd

# copy the current files
COPY . /usr/local/apache2/htdocs/

# expose port 80 for apache server
EXPOSE 80
