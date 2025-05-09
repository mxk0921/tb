package com.uc.webview.export.extension;

import android.content.Context;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.media.MediaPlayerFactory;
import com.uc.webview.internal.setup.j;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class UCPlayer {
    private static final String TAG = "UCPlayer";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Updater {
        Updater setClient(UpdaterClient updaterClient);

        Updater setContext(Context context);

        Updater setDownloader(IUrlDownloader iUrlDownloader);

        Updater setUrl(String str);

        void start() throws UCKnownException;
    }

    public static Updater createUpdater() {
        return j.a();
    }

    public static void setLibPath(String str) {
        j.a(str);
    }

    public static void setMediaPlayerFactory(MediaPlayerFactory mediaPlayerFactory) {
        try {
            Sdk2CoreHost.impl().setMediaPlayerFactory(mediaPlayerFactory);
        } catch (Throwable th) {
            Log.w(TAG, "setMediaPlayerFactory failed", th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class UpdaterClient {
        public boolean onDownloadStart(String str, U4Engine.IDownloadHandle iDownloadHandle) {
            return true;
        }

        public void onDownloadProgress(int i) {
        }

        public void onFailed(UCKnownException uCKnownException) {
        }

        public void onSuccess(String str) {
        }

        public void onDownloadFinish(String str, File file) {
        }
    }
}
