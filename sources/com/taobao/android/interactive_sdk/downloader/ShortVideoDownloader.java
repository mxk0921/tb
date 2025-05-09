package com.taobao.android.interactive_sdk.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ada;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoDownloader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_DOWNLOAD_FINISH = "com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.ACTION_DOWNLOAD_FINISH";
    public static final String ACTION_DOWNLOAD_PROGRESS = "com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.ACTION_DOWNLOAD_PROGRESS";
    public static final String EXTRA_ERROR = "com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.EXTRA_ERROR";
    public static final String EXTRA_PROGRESS = "com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.EXTRA_PROGRESS";
    public static final String EXTRA_VIDEO_ID = "com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.EXTRA_VIDEO_ID";
    public static final long ILLEGAL_TASK_ID = -1;
    public static final ShortVideoDownloader b = new ShortVideoDownloader();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Long, DownloadReceiver> f8125a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class DownloadReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f8126a;
        public final b b;

        public static /* synthetic */ Object ipc$super(DownloadReceiver downloadReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_sdk/downloader/ShortVideoDownloader$DownloadReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (context != null && intent != null) {
                String action = intent.getAction();
                long longExtra = intent.getLongExtra(ShortVideoDownloader.EXTRA_VIDEO_ID, 0L);
                if (longExtra != 0 && longExtra == this.f8126a) {
                    if (ShortVideoDownloader.ACTION_DOWNLOAD_PROGRESS.equals(action)) {
                        int intExtra = intent.getIntExtra(ShortVideoDownloader.EXTRA_PROGRESS, -1);
                        if (intExtra >= 0) {
                            this.b.j(longExtra, intExtra);
                        }
                    } else if (ShortVideoDownloader.ACTION_DOWNLOAD_FINISH.equals(action)) {
                        this.b.J(longExtra, (Error) intent.getSerializableExtra(ShortVideoDownloader.EXTRA_ERROR));
                    }
                }
            }
        }

        public DownloadReceiver(long j, b bVar) {
            this.f8126a = j;
            this.b = bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Error implements Serializable {
        public final int errorCode;
        public final String msg;

        public Error(int i, String str) {
            this.errorCode = i;
            this.msg = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void J(long j, Error error);

        void j(long j, int i);
    }

    public static ShortVideoDownloader a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShortVideoDownloader) ipChange.ipc$dispatch("68ae168a", new Object[0]);
        }
        return b;
    }

    public void b(long j, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8045578", new Object[]{this, new Long(j), bVar});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_DOWNLOAD_PROGRESS);
        intentFilter.addAction(ACTION_DOWNLOAD_FINISH);
        DownloadReceiver downloadReceiver = new DownloadReceiver(j, bVar);
        ((ConcurrentHashMap) this.f8125a).put(Long.valueOf(j), downloadReceiver);
        LocalBroadcastManager.getInstance(ada.a()).registerReceiver(downloadReceiver, intentFilter);
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e63461", new Object[]{this, new Long(j)});
            return;
        }
        LocalBroadcastManager.getInstance(ada.a()).unregisterReceiver((DownloadReceiver) ((ConcurrentHashMap) this.f8125a).get(Long.valueOf(j)));
    }
}
