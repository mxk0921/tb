package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.c;
import com.taobao.trtc.utils.TrtcLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class NativeLibrary {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NativeLibrary";
    private static final Object lock = new Object();
    private static boolean libraryLoaded = false;

    static {
        t2o.a(395313790);
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31482dd0", new Object[]{nativeLibraryLoader, str});
            return;
        }
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.d(TAG, "Native library has already been loaded.");
                    return;
                }
                libraryLoaded = nativeLibraryLoader.load(str);
                TrtcLog.j(TAG, "Loading native library: " + str + ", elapsed: " + c.f13894a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("924426da", new Object[0])).booleanValue();
        }
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }

    public static void onLoadResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243dc88b", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (lock) {
            libraryLoaded = z;
        }
    }
}
