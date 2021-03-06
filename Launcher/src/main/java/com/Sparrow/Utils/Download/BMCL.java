package com.Sparrow.Utils.Download;

import org.to2mbn.jmccc.mcdownloader.provider.DefaultLayoutProvider;

class BMCL extends DefaultLayoutProvider {
    @Override
    protected String getLibraryBaseURL() {
        return "http://bmclapi2.bangbang93.com/libraries/";
    }

    @Override
    protected String getVersionBaseURL() {
        return "http://bmclapi2.bangbang93.com/versions/";
    }

    @Override
    protected String getAssetIndexBaseURL() {
        return "http://bmclapi2.bangbang93.com/indexes/";
    }

    @Override
    protected String getVersionListURL() {
        return "http://bmclapi2.bangbang93.com/mc/game/version_manifest.json";
    }

    @Override
    protected String getAssetBaseURL() {
        return "http://bmclapi2.bangbang93.com/assets/";
    }

}