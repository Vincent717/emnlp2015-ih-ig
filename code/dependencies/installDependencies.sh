#!/usr/bin/env bash
for i in de.tudarmstadt.ukp.dkpro.core.api.discourse-asl de.tudarmstadt.ukp.dkpro.core.api.sentiment-asl de.tudarmstadt.ukp.dkpro.core.discourse.pdtbparser de.tudarmstadt.ukp.dkpro.core.stanfordsentiment-gpl ; do
    cd ${i};
    mvn install
    cd ..
done
