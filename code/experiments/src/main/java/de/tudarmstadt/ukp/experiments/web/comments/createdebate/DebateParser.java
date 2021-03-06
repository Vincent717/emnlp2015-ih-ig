/*
 * Copyright 2016
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tudarmstadt.ukp.experiments.web.comments.createdebate;

import java.io.IOException;
import java.io.InputStream;

/**
 * General interface for debate parsing
 * <p/>
 * (c) 2015 Ivan Habernal
 */
public interface DebateParser
{
    /**
     * Parses the debate
     *
     * @param inputStream input stream
     * @return debate with arguments or {@code null} if the input stream contains no debate (e.g.,
     * another type of html site, etc.) or the debate is not parseable
     * @throws IOException
     */
    Debate parseDebate(InputStream inputStream)
            throws IOException;
}
