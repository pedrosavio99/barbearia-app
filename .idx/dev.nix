{ pkgs, ... }: {
  channel = "stable-24.05";
  packages = [
    pkgs.nodejs_20
    pkgs.nodePackages."@angular/cli"
    pkgs.jdk17 # Adicione o Java 17
  ];
  env = {
    JAVA_HOME = "${pkgs.jdk17}/lib/openjdk"; # Define JAVA_HOME
  };
}