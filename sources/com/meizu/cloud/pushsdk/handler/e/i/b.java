package com.meizu.cloud.pushsdk.handler.e.i;

import com.alibaba.ability.impl.file.FileAbility;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final File f5891a;

    public b(String str) {
        this.f5891a = new File(str);
    }

    private void a(File file, ZipOutputStream zipOutputStream, String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        String sb2 = sb.toString();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (File file2 : listFiles) {
                a(file2, zipOutputStream, sb2);
            }
            return;
        }
        DebugLogger.i("ZipTask", "current file " + sb2 + "/" + file.getName() + " size is " + (file.length() / 1024) + "KB");
        if (file.length() < FileAbility.MAX_FILE_SIZE) {
            byte[] bArr = new byte[1048576];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1048576);
            zipOutputStream.putNextEntry(new ZipEntry(sb2));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    return;
                }
            }
        }
    }

    public void a(String str, List<String> list) throws Exception {
        if (!this.f5891a.exists()) {
            this.f5891a.getParentFile().mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(str + "/" + it.next());
            if (file.exists()) {
                arrayList.add(file);
            }
        }
        a(arrayList, this.f5891a);
    }

    private void a(Collection<File> collection, File file) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1048576));
        for (File file2 : collection) {
            a(file2, zipOutputStream, "");
        }
        zipOutputStream.close();
    }
}
