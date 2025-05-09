package com.taobao.android.fluid.business.videocollection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.Map;
import tb.aon;
import tb.e59;
import tb.i83;
import tb.ir9;
import tb.kon;
import tb.sv2;
import tb.sz3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a implements com.taobao.android.fluid.business.videocollection.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7707a;
    public final IDataService b;
    public final Map<String, kon.h> c = new HashMap(1);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.business.videocollection.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class C0414a implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7708a;

        public C0414a(b bVar) {
            this.f7708a = bVar;
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
            } else if (hVar == null) {
                b bVar = this.f7708a;
                if (bVar != null) {
                    ((i83.a) bVar).a();
                }
                ir9.b("CollectionVideoPlayManager", "【requestCollectionNextVideo】request collection next video failed, target is null");
            } else if (sz3.a(hVar.f22810a)) {
                b bVar2 = this.f7708a;
                if (bVar2 != null) {
                    ((i83.a) bVar2).a();
                }
                ir9.b("CollectionVideoPlayManager", "【requestCollectionNextVideo】request collection next video failed, target.list is null or empty");
            } else {
                String currentContentId = a.a(a.this).getCurrentContentId();
                if (currentContentId == null) {
                    b bVar3 = this.f7708a;
                    if (bVar3 != null) {
                        ((i83.a) bVar3).a();
                    }
                    ir9.b("CollectionVideoPlayManager", "【requestCollectionNextVideo】current content id is null");
                    return;
                }
                a.b(a.this).put(currentContentId, hVar);
                b bVar4 = this.f7708a;
                if (bVar4 != null) {
                    ((i83.a) bVar4).b();
                }
                ir9.b("CollectionVideoPlayManager", "【requestCollectionNextVideo】request collection next video success");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(468713660);
        t2o.a(468713665);
    }

    public a(FluidContext fluidContext) {
        this.f7707a = fluidContext;
        this.b = (IDataService) fluidContext.getService(IDataService.class);
    }

    public static /* synthetic */ IDataService a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDataService) ipChange.ipc$dispatch("4a5a6a2a", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ Map b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83392e13", new Object[]{aVar});
        }
        return aVar.c;
    }

    @Override // com.taobao.android.fluid.business.videocollection.b
    public void cancelPlayCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a393b23", new Object[]{this});
            return;
        }
        ir9.b("CollectionVideoPlayManager", "【cancelPlayCollectionNextVideo】start");
        clearCollectionNextVideo();
        ir9.b("CollectionVideoPlayManager", "【cancelPlayCollectionNextVideo】end");
    }

    @Override // com.taobao.android.fluid.business.videocollection.b
    public void clearCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ba26c4", new Object[]{this});
            return;
        }
        ir9.b("CollectionVideoPlayManager", "【clearCollectionNextVideo】start");
        ((HashMap) this.c).clear();
        ir9.b("CollectionVideoPlayManager", "【clearCollectionNextVideo】end");
    }

    @Override // com.taobao.android.fluid.business.videocollection.b
    public kon.h getCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kon.h) ipChange.ipc$dispatch("d503a28f", new Object[]{this});
        }
        String currentContentId = this.b.getCurrentContentId();
        if (currentContentId == null) {
            ir9.b("CollectionVideoPlayManager", "【getCollectionNextVideo】current contentId is null ");
            return null;
        }
        kon.h hVar = (kon.h) ((HashMap) this.c).get(currentContentId);
        if (hVar == null) {
            ir9.b("CollectionVideoPlayManager", "【getCollectionNextVideo】collectionNextVideo is null");
            return null;
        } else if (!sz3.a(hVar.f22810a)) {
            return hVar;
        } else {
            ir9.b("CollectionVideoPlayManager", "【getCollectionNextVideo】collectionNextVideo.list is null or empty");
            return null;
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.b
    public void playCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24bdfd", new Object[]{this});
            return;
        }
        ir9.b("CollectionVideoPlayManager", "【playCollectionNextVideo】start");
        kon.h collectionNextVideo = getCollectionNextVideo();
        if (collectionNextVideo != null) {
            String currentContentId = this.b.getCurrentContentId();
            if (currentContentId == null) {
                ir9.b("CollectionVideoPlayManager", "【playCollectionNextVideo】current contentId is null ");
                return;
            }
            this.b.replaceDetail(collectionNextVideo, currentContentId);
            ir9.b("CollectionVideoPlayManager", "【playCollectionNextVideo】replace current collection video, current contentId: ".concat(currentContentId));
            clearCollectionNextVideo();
            ir9.b("CollectionVideoPlayManager", "【playCollectionNextVideo】end");
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.b
    public void requestCollectionNextVideo(String str, b bVar) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb74fc5", new Object[]{this, str, bVar});
            return;
        }
        ir9.b("CollectionVideoPlayManager", "【requestCollectionNextVideo】start, nextNid: " + str);
        aon k = aon.g(((ISceneConfigService) this.f7707a.getService(ISceneConfigService.class)).getSessionParams(), ((IDataService) this.f7707a.getService(IDataService.class)).getConfig().j()).u(this.b.getTransmission()).v(this.b.getDetailUnlikeRecorder()).k(e59.a(this.f7707a));
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.f7707a.getService(IDataService.class)).getCurrentMediaSetData();
        if (!(currentMediaSetData == null || (e = currentMediaSetData.e()) == null)) {
            k.c(e.k());
        }
        this.b.requestForCommendData(false, false, false, -1, str, k, new C0414a(bVar));
        ir9.b("CollectionVideoPlayManager", "【requestCollectionNextVideo】end");
    }
}
