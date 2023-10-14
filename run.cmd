@echo off
setlocal

echo %cd%
start mvn spring-boot:run -f ./pom.xml

set port=44399
set timeout=1

:loop
netstat -ano | findstr LISTENING | findstr :%port%
if %errorlevel% equ 0 (
    echo Port %port% is in the listening state.
    goto end
) else (
    echo Port %port% is not in the listening state.
    timeout /t %timeout% >nul
    goto loop
)

:end
endlocal