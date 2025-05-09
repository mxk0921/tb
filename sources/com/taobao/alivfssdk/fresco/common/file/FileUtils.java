package com.taobao.alivfssdk.fresco.common.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import tb.cpm;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class CreateDirectoryException extends IOException {
        static {
            t2o.a(374341742);
        }

        public CreateDirectoryException(String str) {
            super(str);
        }

        public CreateDirectoryException(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class FileDeleteException extends IOException {
        static {
            t2o.a(374341743);
        }

        public FileDeleteException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ParentDirNotFoundException extends FileNotFoundException {
        static {
            t2o.a(374341744);
        }

        public ParentDirNotFoundException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RenameException extends IOException {
        static {
            t2o.a(374341745);
        }

        public RenameException(String str) {
            super(str);
        }

        public RenameException(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    static {
        t2o.a(374341741);
    }

    public static void a(File file) throws CreateDirectoryException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0270e2", new Object[]{file});
            return;
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new CreateDirectoryException(file.getAbsolutePath(), new FileDeleteException(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new CreateDirectoryException(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) throws RenameException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dc79f3", new Object[]{file, file2});
            return;
        }
        cpm.a(file);
        cpm.a(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            if (file2.exists()) {
                th = new FileDeleteException(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th = new ParentDirNotFoundException(file.getAbsolutePath());
            } else if (!file.exists()) {
                th = new FileNotFoundException(file.getAbsolutePath());
            } else {
                th = null;
            }
            throw new RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
        }
    }
}
