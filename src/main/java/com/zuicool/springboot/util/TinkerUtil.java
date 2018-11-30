package com.zuicool.springboot.util;

import com.zuicool.springboot.bean.Tinker;

public class TinkerUtil {

    public static Tinker GetTinkerByPatchVersion(String productType, String version, String patchVersion) {
        if (patchVersion == null) {
            return null;
        }
        String fileName = String.format("%s_v%s_p%s.apk", productType, version, patchVersion);

        String downloadUrl = String.format("http://v.zuicool.org/%s", fileName);

        Tinker tinker = new Tinker();
        tinker.setVersion(version);
        tinker.setPatchVersion(patchVersion);
        tinker.setDownloadUrl(downloadUrl);

        return tinker;
    }
}
