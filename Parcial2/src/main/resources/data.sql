INSERT INTO public.happy_roles VALUES ('DOTR', 'Doctor') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_roles VALUES ('PCTE', 'Paciente') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_roles VALUES ('ASTE', 'Asistente') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_roles VALUES ('ADMI', 'Administrador') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";

INSERT INTO public.happy_specialties VALUES ('CARD', 'Cardiología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('DERM', 'Dermatología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('GAST', 'Gastroenterología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('NEUR', 'Neurología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('PEDI', 'Pediatría') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('PSIQ', 'Psiquiatría') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('ORTO', 'Ortopedia') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('OFAL', 'Oftalmología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('ONCO', 'Oncología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('ENDO', 'Endocrinología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('NEUM', 'Neumología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('UROL', 'Urología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('GINE', 'Ginecología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('HEMA', 'Hematología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('NEFR', 'Nefrología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('REUM', 'Reumatología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('OTOR', 'Otorrinolaringología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('ANES', 'Anestesiología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('RADI', 'Radiología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('CIGE', 'Cirugía General') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('MEIN', 'Medicina Interna') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('MEFA', 'Medicina de Familia') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('METR', 'Medicina del Trabajo') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('MEDE', 'Medicina Deportiva') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('MEFR', 'Medicina Física y Rehabilitación') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('INFE', 'Infectología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('PATO', 'Patología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('GENE', 'Genética Médica') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('GERI', 'Geriatría') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
INSERT INTO public.happy_specialties VALUES ('TOXI', 'Toxicología') ON CONFLICT("id") DO UPDATE SET "name" = excluded."name";
