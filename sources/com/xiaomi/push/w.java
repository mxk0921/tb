package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import java.io.File;
import java.util.HashMap;
import tb.ryp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String> f15138a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f15138a = hashMap;
        hashMap.put("FFD8FF", ryp.FILE_TYPE_IMAGE_JPG);
        hashMap.put("89504E47", "png");
        hashMap.put("47494638", "gif");
        hashMap.put("474946", "gif");
        hashMap.put("424D", "bmp");
    }

    public static long a(File file) {
        long length;
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    length = a(listFiles[i]);
                } else {
                    length = listFiles[i].length();
                }
                j += length;
            }
        } catch (Exception e) {
            b.a(e);
        }
        return j;
    }
}
