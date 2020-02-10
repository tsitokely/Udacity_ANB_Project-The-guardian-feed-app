/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.project6_newsapp;

/**
 * An {@link Story} object contains information related to a single story.
 */
public class Story {

    /** Title of the story */
    private String mTitle;

    /** Section of the story */
    private String mSection;

    /** Author of the story */
    private String mAuthor;

    /** Website URL for the story */
    private String mUrl;

    /** Date of story publication on the web  */
    private String mDateTime;

    /**
     * Constructs a new {@link Story} object.
     *
     * @param title is title of the news story
     * @param section is the category of the news story on the guardian
     * @param author is author of the story
     * @param url is the website URL to find more details about the story
     * @param dateTime is the date and time of publication on the guardian website
     */
    public Story(String title, String section, String author, String url, String dateTime) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mUrl = url;
        mDateTime = dateTime;
    }

    /**
     * Returns the title of the story
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the story
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the author of the story
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the URL of the story
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the author of the story
     */
    public String getDateTime() {
        return mDateTime;
    }
}
