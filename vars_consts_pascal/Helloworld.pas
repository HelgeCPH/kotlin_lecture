program Helloworld;
const
  msg : PChar = 'Hello, World!';
  almost_meaning : integer = 41;
var
  meaning : integer;
begin
  WriteLn(msg);
  meaning := almost_meaning + 1;
  WriteLn(meaning);
end.