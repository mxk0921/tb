package com.taobao.android.tbreakpad;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.UUID;
import tb.fbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBreakpadConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String mApplicationInformation;
    public final String mBreakpadSoPath;
    public final Context mContext;
    public final String mCpuAbi;
    public final String mCpuInformation;
    public final String mHardware;
    public final String mNameHeader;
    public final String mPath;
    public final String mProcessName;
    public final String mRuntimeInformation;
    public final boolean mSupportAnr;
    public final boolean mSupportForceDump;
    public final String mUnwindSoPath;
    public final String mBuildFingerPrint = Build.FINGERPRINT;
    public final String mUuid = UUID.randomUUID().toString().toLowerCase();
    public final boolean mIsDebuggable = false;
    public final String mMobileInformation = String.format("'model: %s/version: %s/sdk: %d'", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT));
    public final String mCrashInformation = "'version: 1.0.0/nativeseq: unknown/javaseq: unknown/target: release'";
    public final String mBuildVersionIncremental = Build.VERSION.INCREMENTAL;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class NativeSwitch {
        public final String key;
        public final boolean value;

        public NativeSwitch(String str, boolean z) {
            this.key = str;
            this.value = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f9546a;
        public final boolean b;
        public final File c;
        public final String d;
        public boolean e;
        public String f = "";
        public String g = "";
        public String h = "";
        public String i = "";
        public String j = "";

        public a(Context context, File file, String str, boolean z) {
            this.f9546a = context;
            this.c = file;
            this.d = str;
            this.b = z;
        }

        public TBreakpadConfig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBreakpadConfig) ipChange.ipc$dispatch("13f84700", new Object[]{this});
            }
            return new TBreakpadConfig(this);
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50986ca0", new Object[]{this, str});
            } else {
                this.j = str;
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("145c4069", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c179b78b", new Object[]{this, str});
            } else {
                this.i = str;
            }
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33a5c57b", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74223b74", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }
    }

    public TBreakpadConfig(a aVar) {
        String str;
        Context context = aVar.f9546a;
        this.mContext = context;
        String str2 = aVar.g;
        String str3 = aVar.i;
        String str4 = aVar.j;
        String str5 = aVar.h;
        this.mApplicationInformation = "'version: " + str2 + "/subversion: " + str3 + "/buildseq: " + str4 + "/versioncode:" + str5 + "'";
        String abisToString = abisToString(Build.SUPPORTED_ABIS);
        String str6 = Build.HARDWARE;
        StringBuilder sb = new StringBuilder("'abi: ");
        sb.append(abisToString);
        sb.append("/processor: AArch64 Processor rev 4 (aarch64)/hardware: ");
        sb.append(str6);
        sb.append("'");
        this.mCpuInformation = sb.toString();
        long currentTimeMillis = System.currentTimeMillis();
        long maxMemory = Runtime.getRuntime().maxMemory();
        String str7 = Build.CPU_ABI;
        this.mRuntimeInformation = "'start: " + currentTimeMillis + "/maxheap: " + maxMemory + "/primaryabi: " + str7 + "/ground: '";
        this.mPath = aVar.c.getAbsolutePath();
        this.mNameHeader = aVar.d;
        this.mProcessName = aVar.f;
        this.mSupportAnr = aVar.b;
        this.mSupportForceDump = aVar.e;
        this.mCpuAbi = str7;
        this.mHardware = str6;
        String str8 = "tbreakpad";
        fbn.b b = fbn.b(context, str8);
        this.mBreakpadSoPath = !TextUtils.isEmpty(b.f19173a) ? b.f19173a : str8;
        fbn.b b2 = fbn.b(context, "tunwindstack");
        if (TextUtils.isEmpty(b2.f19173a)) {
            str = "libtunwindstack.so";
        } else {
            str = b2.f19173a;
        }
        this.mUnwindSoPath = str;
    }

    public static String abisToString(String[] strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303f2bff", new Object[]{strArr});
        }
        if (strArr == null) {
            return "null";
        }
        int length = strArr.length - 1;
        if (length == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(strArr[i]);
            if (i == length) {
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }
}
