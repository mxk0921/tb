package com.taobao.android.tcon;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TconMallocBase extends TconBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final short ESTIMATED_PAGE_VISIT_COUNT = 5;
    private static boolean sCheckedNativeCrashResult;
    private static volatile boolean sHasCheckedNativeCrash;
    private static volatile boolean sMallocIntercepted;
    private static boolean sMallocInterceptionResult;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements OnFileCreatedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f9633a;

        public a(File file) {
            this.f9633a = file;
        }

        @Override // com.taobao.android.tcrash.OnFileCreatedListener
        public void onFileCreated(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8cac13e", new Object[]{this, str});
                return;
            }
            try {
                this.f9633a.createNewFile();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean checkAndInstallNativeCrashCallback(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40a90933", new Object[]{application})).booleanValue();
        }
        if (!sHasCheckedNativeCrash) {
            synchronized (TconMallocBase.class) {
                try {
                    if (!sHasCheckedNativeCrash) {
                        sHasCheckedNativeCrash = true;
                        File file = new File(application.getFilesDir().getAbsolutePath() + "/tcon_nativecrash_0.sig");
                        if (file.exists()) {
                            file.delete();
                            sCheckedNativeCrashResult = true;
                        } else {
                            sCheckedNativeCrashResult = false;
                        }
                        TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.NATIVE_ONLY, new a(file));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sCheckedNativeCrashResult;
    }

    public static /* synthetic */ Object ipc$super(TconMallocBase tconMallocBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcon/TconMallocBase");
    }

    public static native boolean nativeReplaceSystemMalloc();

    public static boolean replaceSystemMalloc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f975dd6", new Object[0])).booleanValue();
        }
        if (!sMallocIntercepted) {
            synchronized (TconMallocBase.class) {
                try {
                    if (!sMallocIntercepted) {
                        sMallocInterceptionResult = nativeReplaceSystemMalloc();
                        sMallocIntercepted = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sMallocInterceptionResult;
    }
}
