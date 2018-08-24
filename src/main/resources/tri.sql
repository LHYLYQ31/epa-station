create or replace trigger TVEHICLE_tri
  before update
  on TVEHICLE 
  for each row 
declare
  -- local variables here
begin
   if updating ('CVEHICLEKIND') or updating ('CNUMBERPLATE')or updating ('CPLATETYPE')or updating ('CVIN')or updating ('NODOMETER')or updating ('CNEARUNITCODE')or updating ('EXT_COL10')
    then 
      insert into 
      TVEHICLE_TEMP (id, CVEHICLECODE, CVEHICLEKIND , CNUMBERPLATE , CPLATETYPE , CVIN , NODOMETER , CNEARUNITCODE , EXT_COL10, EXCHANGE )
      values (sys_guid(),:old.CVEHICLECODE , :new.CVEHICLEKIND , :new.CNUMBERPLATE , :new.CPLATETYPE , :new.CVIN , :new.NODOMETER , :new.CNEARUNITCODE , :new.EXT_COL10 , :new.EXCHANGE);
 
  end if;
end mobile_pdf_tri;