package com.etao.feimagesearch;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.caa;
import tb.h8h;
import tb.hgg;
import tb.kv9;
import tb.t2o;
import tb.u7m;
import tb.z7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ImagePopTask implements hgg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_VISIT_ITEM_ID = "pop:last_visit_item_id";
    public static final String KEY_LAST_VISIT_TIME = "pop:last_visit_time";
    private boolean alwaysShow;
    private int imageCnt;
    private WeakReference<b> listener;
    private List<AlbumMediaItem> localImageList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a extends b {
        void p2(List<AlbumMediaItem> list, List<kv9> list2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void J(String str, boolean z, Map<String, String> map);
    }

    static {
        t2o.a(481296396);
        t2o.a(481296908);
    }

    public ImagePopTask(b bVar) {
        this.imageCnt = 1;
        this.alwaysShow = false;
        this.listener = new WeakReference<>(bVar);
    }

    private Map<String, String> generateLocalFileTrace(AlbumMediaItem albumMediaItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72b565fa", new Object[]{this, albumMediaItem});
        }
        if (albumMediaItem == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (z7n.k(albumMediaItem.imgFilePath)) {
            hashMap.put("picType", "screenshot");
        } else {
            hashMap.put("picType", "common");
        }
        hashMap.put("intervalTime", String.valueOf(System.currentTimeMillis() - (Long.parseLong(albumMediaItem.lastUpdateTime) * 1000)));
        return hashMap;
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        boolean d = u7m.d(caa.c());
        if (this.imageCnt == 1) {
            if (!h8h.e().g()) {
                onRecentImageShow(null);
                return;
            } else if (!d) {
                onRecentImageShow(null);
                return;
            } else {
                Uri f = h8h.e().f();
                h8h.e().j();
                if (f != null) {
                    AlbumMediaItem albumMediaItem = new AlbumMediaItem();
                    albumMediaItem.canShow = true;
                    albumMediaItem.imgUri = f;
                    onRecentImageShow(Collections.singletonList(albumMediaItem));
                    return;
                }
            }
        }
        new hgg(this, this.imageCnt).execute(new Void[0]);
    }

    @Override // tb.hgg.a
    public boolean isResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7649b58", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hgg.a
    public void onRecentImageShow(List<AlbumMediaItem> list) {
        AlbumMediaItem albumMediaItem;
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6bab76", new Object[]{this, list});
            return;
        }
        b bVar = this.listener.get();
        if (bVar != null) {
            if (list == null || list.size() <= 0) {
                albumMediaItem = null;
            } else {
                albumMediaItem = list.get(0);
            }
            String str = "";
            if (this.alwaysShow) {
                if (bVar instanceof a) {
                    ((a) bVar).p2(list, null);
                    return;
                }
                if (albumMediaItem != null) {
                    str = albumMediaItem.imgUri.toString();
                }
                bVar.J(str, true, generateLocalFileTrace(albumMediaItem));
            } else if (albumMediaItem != null && albumMediaItem.canShow && (uri = albumMediaItem.imgUri) != null) {
                this.localImageList = list;
                if (bVar instanceof a) {
                    ((a) bVar).p2(list, null);
                } else {
                    bVar.J(uri.toString(), true, generateLocalFileTrace(albumMediaItem));
                }
            } else if (bVar instanceof a) {
                ((a) bVar).p2(null, null);
            } else {
                bVar.J(str, true, null);
            }
        }
    }

    public ImagePopTask(b bVar, int i) {
        this(bVar);
        this.imageCnt = i;
    }

    public ImagePopTask(b bVar, int i, boolean z) {
        this(bVar, i);
        this.alwaysShow = z;
    }
}
