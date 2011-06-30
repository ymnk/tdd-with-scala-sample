@set SCRIPT_DIR=%~dp0
@if "%TERM%"=="emacs" set jlineopt=-Djline.WindowsTerminal.directConsole=false
@java %SBT_OPTS% %jlineopt% -Dfile.encoding=UTF-8 -Xmx512M -jar "%SCRIPT_DIR%sbt-launch-0.7.4.jar" %*
