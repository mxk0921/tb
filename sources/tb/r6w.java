package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Material;
import com.taobao.android.litecreator.sdk.editor.data.MaterialNode;
import com.taobao.android.litecreator.sdk.editor.data.MultiVideoClips;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.tao.Globals;
import com.taobao.umipublish.draft.DraftMediaHelper;
import com.taobao.umipublish.draft.DraftModel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r6w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MARVEL_TEMPLATE = "marvelTemplate";
    public static final String VIDEO_EDIT_SERIALIZE_JSON = "videoEditSerialize.json";

    /* renamed from: a  reason: collision with root package name */
    public final IUGCMedia f27154a;
    public final DraftMediaHelper b = new DraftMediaHelper(Globals.getApplication());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements DraftMediaHelper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f27155a;
        public final /* synthetic */ DraftMediaHelper.a b;

        public a(r6w r6wVar, AtomicInteger atomicInteger, DraftMediaHelper.a aVar) {
            this.f27155a = atomicInteger;
            this.b = aVar;
        }

        @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            } else {
                this.b.onError(str);
            }
        }

        @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (this.f27155a.incrementAndGet() == 3) {
                this.b.onSuccess();
            }
        }
    }

    static {
        t2o.a(944767260);
    }

    public r6w(IUGCMedia iUGCMedia) {
        this.f27154a = iUGCMedia;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.litecreator.sdk.editor.data.EditorInfo a(com.taobao.umipublish.draft.DraftModel r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r6w.a(com.taobao.umipublish.draft.DraftModel, java.lang.String):com.taobao.android.litecreator.sdk.editor.data.EditorInfo");
    }

    public void b(IUGCMedia iUGCMedia, DraftModel draftModel, DraftMediaHelper.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cf0db3", new Object[]{this, iUGCMedia, draftModel, aVar});
        } else if (ydv.v()) {
            if (iUGCMedia.getVideos() == null || iUGCMedia.getVideos().isEmpty() || iUGCMedia.getVideos().get(0).editorInfo == null) {
                aVar.onError("getVideos null");
                return;
            }
            String publishSessionId = this.f27154a.getPublishSessionId();
            File h = this.b.h(publishSessionId, draftModel);
            EditorInfo editorInfo = iUGCMedia.getVideos().get(0).editorInfo;
            if (h == null || editorInfo.resource == null) {
                aVar.onError("cacheDir or resource nul");
                return;
            }
            a aVar2 = new a(this, new AtomicInteger(0), aVar);
            Resource resource = editorInfo.resource;
            MultiVideoClips multiVideoClips = resource.compressData;
            if (multiVideoClips == null) {
                multiVideoClips = resource.originData;
            }
            if (multiVideoClips == null || multiVideoClips.data.isEmpty()) {
                aVar2.onSuccess();
            } else {
                ArrayList arrayList = new ArrayList();
                for (MultiVideoClips.MediaResource mediaResource : multiVideoClips.data) {
                    arrayList.add(mediaResource.path);
                }
                this.b.c(draftModel, publishSessionId, "resource", aVar2, arrayList);
            }
            Material material = editorInfo.material;
            if (material == null || material.materialNodes.isEmpty()) {
                aVar2.onSuccess();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (MaterialNode materialNode : editorInfo.material.materialNodes) {
                    arrayList2.add(materialNode.nodePath);
                }
                this.b.c(draftModel, publishSessionId, DraftMediaHelper.DraftType.MATERIALS, aVar2, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            File file = new File(new File(h, DraftMediaHelper.DraftType.SERIALIZE), VIDEO_EDIT_SERIALIZE_JSON);
            arrayList3.add(file.getAbsolutePath());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(JSON.toJSONString(editorInfo).getBytes("UTF-8"));
                fileOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.b.c(draftModel, publishSessionId, DraftMediaHelper.DraftType.SERIALIZE, aVar2, arrayList3);
        }
    }
}
