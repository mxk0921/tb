package com.taobao.android.nanocompose.platform_registry;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.ckf;
import tb.g9z;
import tb.prz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AndroidDownload {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private static final g9z downloadImpl = new prz();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737169);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public final g9z c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g9z) ipChange.ipc$dispatch("848709f9", new Object[]{this});
            }
            return AndroidDownload.access$getDownloadImpl$cp();
        }

        public Companion() {
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [T, java.util.zip.ZipEntry] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Throwable, java.lang.String] */
        /* JADX WARN: Unknown variable types count: 1 */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r8, java.lang.String r9) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.nanocompose.platform_registry.AndroidDownload.Companion.a(java.lang.String, java.lang.String):java.lang.String");
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, byte[]] */
        @JvmStatic
        public final byte[] b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("aaa436e4", new Object[]{this, str});
            }
            ckf.g(str, "url");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new byte[0];
            c().a(str, new AndroidDownload$Companion$download$1(ref$ObjectRef), AndroidDownload$Companion$download$2.INSTANCE);
            return (byte[]) ref$ObjectRef.element;
        }
    }

    static {
        t2o.a(598737168);
    }

    public static final /* synthetic */ g9z access$getDownloadImpl$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g9z) ipChange.ipc$dispatch("e7d47bc4", new Object[0]);
        }
        return downloadImpl;
    }

    @JvmStatic
    public static final String decompressFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40456dc6", new Object[]{str, str2});
        }
        return Companion.a(str, str2);
    }

    @JvmStatic
    public static final byte[] download(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aaa436e4", new Object[]{str});
        }
        return Companion.b(str);
    }
}
