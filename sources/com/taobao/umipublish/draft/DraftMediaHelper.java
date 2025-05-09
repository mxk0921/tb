package com.taobao.umipublish.draft;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.cg9;
import tb.dw7;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DraftMediaHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface DraftType {
        public static final String MATERIALS = "materials";
        public static final String PRODUCT = "product";
        public static final String RESOURCE = "resource";
        public static final String SERIALIZE = "serialize";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onError(String str);

        void onSuccess();
    }

    static {
        t2o.a(944766991);
    }

    public DraftMediaHelper(Context context) {
    }

    public static boolean j(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88e3761a", new Object[]{draftModel})).booleanValue();
        }
        if (draftModel == null || !TextUtils.equals(draftModel.version, "3")) {
            return false;
        }
        return true;
    }

    public DraftModel a(DraftModel draftModel) {
        DraftModel.Meta meta;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("7dabf9d3", new Object[]{this, draftModel});
        }
        if (!(draftModel == null || (meta = draftModel.meta) == null)) {
            if (meta.videos != null) {
                ArrayList arrayList = new ArrayList();
                for (DraftModel.Video video : draftModel.meta.videos) {
                    if (video != null && (!cg9.m(video.coverLocalUrl) || !cg9.m(video.videoLocalUrl))) {
                        arrayList.add(video);
                        if (!TextUtils.isEmpty(video.coverLocalUrl)) {
                            cg9.j(new File(video.coverLocalUrl));
                        }
                        if (!TextUtils.isEmpty(video.videoLocalUrl)) {
                            cg9.j(new File(video.videoLocalUrl));
                        }
                    }
                }
                draftModel.meta.videos.removeAll(arrayList);
            }
            if (draftModel.meta.photos != null) {
                ArrayList arrayList2 = new ArrayList();
                for (DraftModel.Photo photo : draftModel.meta.photos) {
                    if (photo != null && !cg9.m(photo.localUrl)) {
                        arrayList2.add(photo);
                    }
                }
                draftModel.meta.photos.removeAll(arrayList2);
            }
        }
        return draftModel;
    }

    public void b(DraftModel draftModel, DraftModel draftModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c77c0", new Object[]{this, draftModel, draftModel2});
            return;
        }
        DraftModel.Meta meta = draftModel.meta;
        if (meta != null) {
            List<DraftModel.Video> list = meta.videos;
            if (list != null) {
                for (DraftModel.Video video : list) {
                    if (video != null) {
                        String str = video.coverLocalUrl;
                        String str2 = draftModel.localPathToCdnUrl.get(str);
                        if (TextUtils.isEmpty(video.coverOriginFile)) {
                            video.coverOriginFile = video.coverLocalUrl;
                        }
                        String d = d(DraftType.PRODUCT, video.coverLocalUrl, draftModel);
                        video.coverLocalUrl = d;
                        if (str2 != null && !TextUtils.equals(d, str)) {
                            draftModel.localPathToCdnUrl.put(video.coverLocalUrl, str2);
                            draftModel.localPathToCdnUrl.remove(str);
                        }
                        String str3 = video.videoLocalUrl;
                        if (TextUtils.isEmpty(video.videoOriginFile)) {
                            video.videoOriginFile = video.videoLocalUrl;
                        }
                        String str4 = draftModel.localPathToCdnUrl.get(str3);
                        String d2 = d(DraftType.PRODUCT, video.videoLocalUrl, draftModel);
                        video.videoLocalUrl = d2;
                        if (str4 != null && !TextUtils.equals(d2, str3)) {
                            draftModel.localPathToCdnUrl.put(video.videoLocalUrl, str4);
                            draftModel.localPathToCdnUrl.remove(str3);
                        }
                        if (!(str2 == null || str4 == null)) {
                            Map<String, String> map = draftModel.localPathToCdnUrl;
                            map.put(video.videoLocalUrl + "-cover.jpg", video.coverLocalUrl);
                        }
                    }
                }
            }
            List<DraftModel.Photo> list2 = draftModel.meta.photos;
            if (list2 != null) {
                for (DraftModel.Photo photo : list2) {
                    if (photo != null) {
                        String str5 = photo.localUrl;
                        String str6 = draftModel.localPathToCdnUrl.get(str5);
                        if (TextUtils.isEmpty(photo.originFilePath)) {
                            photo.originFilePath = photo.localUrl;
                        }
                        String d3 = d(DraftType.PRODUCT, photo.localUrl, draftModel);
                        photo.localUrl = d3;
                        if (str6 != null && !TextUtils.equals(d3, str5)) {
                            draftModel.localPathToCdnUrl.put(photo.localUrl, str6);
                            draftModel.localPathToCdnUrl.remove(str5);
                        }
                    }
                }
            }
        }
    }

    public void c(DraftModel draftModel, String str, @DraftType String str2, a aVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b16c3c", new Object[]{this, draftModel, str, str2, aVar, list});
            return;
        }
        File h = h(str, draftModel);
        if (h == null || list == null) {
            if (aVar != null) {
                aVar.onError("cacheDir null");
            }
        } else if (list.size() != 0) {
            File file = new File(h, str2);
            if (file.exists() || file.mkdir()) {
                AtomicInteger atomicInteger = new AtomicInteger(list.size());
                for (String str3 : list) {
                    if (!str3.startsWith(file.getAbsolutePath())) {
                        File file2 = new File(str3);
                        File file3 = new File(file, file2.getName());
                        if (file2.isDirectory()) {
                            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                            if (cg9.b(str3, file3.getAbsolutePath())) {
                                UmiPublishMonitor.B(DraftManager.TAG, "copyAssetsMediasOfDraft dir cost" + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                                if (atomicInteger.decrementAndGet() == 0) {
                                    aVar.onSuccess();
                                    return;
                                }
                            } else {
                                aVar.onError("copyFile err");
                                return;
                            }
                        } else if (cg9.m(str3)) {
                            long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                            if (cg9.e(file2, file3.getAbsolutePath())) {
                                UmiPublishMonitor.B(DraftManager.TAG, "copyAssetsMediasOfDraft cost" + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis2));
                                if (atomicInteger.decrementAndGet() == 0) {
                                    aVar.onSuccess();
                                    return;
                                }
                            } else {
                                aVar.onError("copyFile err");
                                return;
                            }
                        } else if (atomicInteger.decrementAndGet() == 0) {
                            aVar.onSuccess();
                            return;
                        }
                    } else if (atomicInteger.decrementAndGet() == 0) {
                        aVar.onSuccess();
                        return;
                    }
                }
            } else if (aVar != null) {
                aVar.onError("typeDir null");
            }
        } else if (aVar != null) {
            aVar.onSuccess();
        }
    }

    public boolean f(Collection<DraftModel> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d5fbd0c", new Object[]{this, collection})).booleanValue();
        }
        if (collection != null) {
            for (DraftModel draftModel : collection) {
                if (!e(draftModel)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Deprecated
    public File g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("523928da", new Object[]{this, context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        if (externalCacheDir == null) {
            return null;
        }
        File file = new File(externalCacheDir, "umi_draft");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        return null;
    }

    public File h(String str, DraftModel draftModel) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aea1695", new Object[]{this, str, draftModel});
        }
        if (j(draftModel)) {
            file = dw7.b(dw7.CACHE_DRAFT_PATH);
        } else {
            file = dw7.a(dw7.CACHE_DRAFT_PATH);
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "videoEditDraft-" + str);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        return null;
    }

    public final File i(DraftModel draftModel) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2d27b026", new Object[]{this, draftModel});
        }
        if (j(draftModel)) {
            file = dw7.b(dw7.CACHE_DRAFT_PATH);
        } else {
            file = dw7.a(dw7.CACHE_DRAFT_PATH);
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, draftModel.draftId);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        UmiPublishMonitor.B(DraftManager.TAG, "getPublishDraftDir. mkdir error: path=" + file.getAbsolutePath() + "/" + draftModel.draftId);
        return null;
    }

    public final String d(@DraftType String str, String str2, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21d7cc8e", new Object[]{this, str, str2, draftModel});
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        File i = i(draftModel);
        if (i == null) {
            return null;
        }
        File file = new File(i, str);
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        if (str2.startsWith(file.getAbsolutePath())) {
            return str2;
        }
        File file2 = new File(str2);
        File file3 = new File(file, file2.getName());
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (cg9.e(file2, file3.getAbsolutePath())) {
            odg.c(DraftManager.TAG, "copied " + str2 + " to " + file3.getAbsolutePath());
            StringBuilder sb = new StringBuilder("copyAssetsMediasOfDraft cost");
            sb.append(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis);
            UmiPublishMonitor.B(DraftManager.TAG, sb.toString());
        }
        return file3.getAbsolutePath();
    }

    public boolean e(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2022b6", new Object[]{this, draftModel})).booleanValue();
        }
        if (draftModel != null) {
            File h = h(draftModel.urlParams.get("umi_pub_session"), draftModel);
            if (h != null) {
                cg9.j(h);
            }
            File i = i(draftModel);
            if (i != null) {
                cg9.j(i);
                return true;
            }
            UmiPublishMonitor.B(DraftManager.TAG, "deleteMediasOfDraft failed! mediaCacheOfDraftModel is null");
        } else {
            UmiPublishMonitor.B(DraftManager.TAG, "deleteMediasOfDraft failed! draftModel is null");
        }
        return false;
    }
}
