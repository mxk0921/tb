package com.uc.webview.base;

import android.util.Log;
import com.android.alibaba.ip.server.FileManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j {
    public static String a(String str) {
        Path path;
        Path path2;
        if (!GlobalSettings.getBoolValue(78)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(".jar");
        String str2 = "jar";
        if (lastIndexOf < 0 && (lastIndexOf = str.lastIndexOf(FileManager.CLASSES_DEX_SUFFIX)) > 0) {
            str2 = "dex";
        }
        if (lastIndexOf <= 0) {
            return str;
        }
        String str3 = str.substring(0, lastIndexOf) + str2;
        if (new File(str3).exists()) {
            return str3;
        }
        try {
            path = Paths.get(str3, new String[0]);
            path2 = Paths.get(str, new String[0]);
            Files.createSymbolicLink(path, path2, new FileAttribute[0]);
        } catch (FileAlreadyExistsException unused) {
        } catch (IOException e) {
            Log.e("UCLoaderAndroid12", "failed to create symblic file: " + str + ", and use the default dex path: " + str, e);
            return str;
        }
        return str3;
    }
}
