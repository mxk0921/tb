package com.taobao.android.dressup.common.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a07;
import tb.afi;
import tb.at4;
import tb.ckf;
import tb.hfn;
import tb.i04;
import tb.qpu;
import tb.sj4;
import tb.t2o;
import tb.vu0;
import tb.yz3;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012¨\u0006\""}, d2 = {"Lcom/taobao/android/dressup/common/model/MediaBrowserModel;", "Lcom/taobao/android/dressup/common/model/CardModel;", "<init>", "()V", "", "Ltb/afi;", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "", "maxZoom", UTConstant.Args.UT_SUCCESS_F, "getMaxZoom", "()F", "setMaxZoom", "(F)V", "", "pullDownEnable", "Z", "getPullDownEnable", "()Z", "setPullDownEnable", "(Z)V", "autoClose", "getAutoClose", "setAutoClose", "pullDownOffset", "getPullDownOffset", "setPullDownOffset", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaBrowserModel extends CardModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final float MAX_MEDIA_HEIGHT = 1005.0f;
    private static final float MEDIA_WIDTH = 750.0f;
    private List<? extends afi> list;
    private float maxZoom = 2.0f;
    private boolean pullDownEnable = true;
    private boolean autoClose = true;
    private float pullDownOffset = 150.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552670);
        }

        public a() {
        }

        public static /* synthetic */ List f(a aVar, qpu qpuVar, List list, afi afiVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a9b935d1", new Object[]{aVar, qpuVar, list, afiVar, new Integer(i), obj});
            }
            if ((i & 4) != 0) {
                afiVar = null;
            }
            return aVar.c(qpuVar, list, afiVar);
        }

        public final Pair<Float, Float> a(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("95418c09", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            }
            if (f / f2 >= MediaBrowserModel.MEDIA_WIDTH / f3) {
                return new Pair<>(Float.valueOf((float) MediaBrowserModel.MEDIA_WIDTH), Float.valueOf((f2 * MediaBrowserModel.MEDIA_WIDTH) / f));
            }
            return new Pair<>(Float.valueOf((f * f3) / f2), Float.valueOf(f3));
        }

        public final float b(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65521b99", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
            }
            return hfn.e((f2 * MediaBrowserModel.MEDIA_WIDTH) / f, MediaBrowserModel.MAX_MEDIA_HEIGHT);
        }

        public final MediaBrowserModel d(qpu qpuVar, List<? extends Map<String, ? extends Object>> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaBrowserModel) ipChange.ipc$dispatch("d6d55668", new Object[]{this, qpuVar, list});
            }
            ckf.g(qpuVar, "context");
            MediaBrowserModel mediaBrowserModel = new MediaBrowserModel();
            mediaBrowserModel.setList(f(this, qpuVar, list, null, 4, null));
            return mediaBrowserModel;
        }

        public final void e(afi afiVar, Map<String, ? extends Object> map, int i, Context context, Float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7df47a3", new Object[]{this, afiVar, map, new Integer(i), context, fArr});
            } else if (i == 0) {
                at4.a aVar = at4.Companion;
                afiVar.setDisplayWidth(at4.a.c(aVar, context, Float.valueOf((float) MediaBrowserModel.MEDIA_WIDTH), false, 4, null));
                Float valueOf = Float.valueOf(b(afiVar.getWidth(), afiVar.getHeight()));
                fArr[0] = valueOf;
                afiVar.setDisplayHeight(at4.a.c(aVar, context, valueOf, false, 4, null));
                Object obj = map.get("dailyDressAnchors");
                if (obj instanceof List) {
                    afiVar.setAnchors(vu0.Companion.a(afiVar.getWidth(), afiVar.getHeight(), MediaBrowserModel.MEDIA_WIDTH, fArr[0].floatValue(), i04.X((Iterable) obj), 22.0f, 32.0f));
                }
            } else {
                Pair<Float, Float> a2 = a(afiVar.getWidth(), afiVar.getHeight(), fArr[0].floatValue());
                at4.a aVar2 = at4.Companion;
                afiVar.setDisplayWidth(at4.a.c(aVar2, context, a2.getFirst(), false, 4, null));
                afiVar.setDisplayHeight(at4.a.c(aVar2, context, a2.getSecond(), false, 4, null));
                Object obj2 = map.get("dailyDressAnchors");
                if (obj2 instanceof List) {
                    afiVar.setAnchors(vu0.Companion.b(afiVar.getWidth(), afiVar.getHeight(), a2.getFirst().floatValue(), a2.getSecond().floatValue(), i04.X((Iterable) obj2), 22.0f, 32.0f));
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final List<afi> c(qpu qpuVar, List<? extends Map<String, ? extends Object>> list, afi afiVar) {
            ArrayList arrayList;
            afi afiVar2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("96e5e295", new Object[]{this, qpuVar, list, afiVar});
            }
            ckf.g(qpuVar, "turboEngineContext");
            Context context = qpuVar.getContext();
            Float[] fArr = {Float.valueOf(0.0f)};
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    Map map = (Map) obj;
                    if (ckf.b(map.get("type"), "pic") || ckf.b(map.get("type"), "video")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            String o = qpuVar.a().o("picQuality");
            if (o == null) {
                o = "90";
            }
            String concat = "q".concat(o);
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(zz3.q(arrayList, 10));
            int i = 0;
            for (Object obj2 : arrayList) {
                i++;
                if (i >= 0) {
                    Map<String, ? extends Object> map2 = (Map) obj2;
                    if (!ckf.b(map2.get("type"), "pic")) {
                        Object javaObject = JSON.toJavaObject(new JSONObject(map2), VideoModel.class);
                        VideoModel videoModel = (VideoModel) javaObject;
                        a aVar = MediaBrowserModel.Companion;
                        ckf.f(videoModel, "this");
                        aVar.e(videoModel, map2, i, context, fArr);
                        afiVar2 = (afi) javaObject;
                    } else if (ckf.b(map2.get("picType"), sj4.PICTURE_TYPE_LIVE_PHOTO)) {
                        Object javaObject2 = JSON.toJavaObject(new JSONObject(map2), LivePhotoModel.class);
                        LivePhotoModel livePhotoModel = (LivePhotoModel) javaObject2;
                        livePhotoModel.setOriginalData(new JSONObject(map2));
                        MediaBrowserModel.Companion.e(livePhotoModel, map2, i, context, fArr);
                        livePhotoModel.setPicQuality(concat);
                        afiVar2 = (afi) javaObject2;
                    } else {
                        Object javaObject3 = JSON.toJavaObject(new JSONObject(map2), PhotoModel.class);
                        PhotoModel photoModel = (PhotoModel) javaObject3;
                        a aVar2 = MediaBrowserModel.Companion;
                        ckf.f(photoModel, "this");
                        aVar2.e(photoModel, map2, i, context, fArr);
                        photoModel.setPicQuality(concat);
                        Object obj3 = map2.get("cacheDrawable");
                        if (!(obj3 instanceof Drawable)) {
                            obj3 = null;
                        }
                        photoModel.setCacheDrawable((Drawable) obj3);
                        if (photoModel.getCacheDrawable() == null && afiVar != null && (afiVar instanceof PhotoModel)) {
                            PhotoModel photoModel2 = (PhotoModel) afiVar;
                            if (ckf.b(photoModel2.getMainPicUrl(), photoModel.getMainPicUrl())) {
                                photoModel.setCacheDrawable(photoModel2.getCacheDrawable());
                            }
                        }
                        afiVar2 = (afi) javaObject3;
                    }
                    arrayList2.add(afiVar2);
                } else {
                    yz3.p();
                    throw null;
                }
            }
            return arrayList2;
        }
    }

    static {
        t2o.a(918552669);
    }

    public static /* synthetic */ Object ipc$super(MediaBrowserModel mediaBrowserModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/model/MediaBrowserModel");
    }

    public final boolean getAutoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f4c99de", new Object[]{this})).booleanValue();
        }
        return this.autoClose;
    }

    public final List<afi> getList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85f5d54c", new Object[]{this});
        }
        return this.list;
    }

    public final float getMaxZoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("879b3318", new Object[]{this})).floatValue();
        }
        return this.maxZoom;
    }

    public final boolean getPullDownEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2164e6b", new Object[]{this})).booleanValue();
        }
        return this.pullDownEnable;
    }

    public final float getPullDownOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a628567", new Object[]{this})).floatValue();
        }
        return this.pullDownOffset;
    }

    public final void setAutoClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523dbc46", new Object[]{this, new Boolean(z)});
        } else {
            this.autoClose = z;
        }
    }

    public final void setList(List<? extends afi> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34bb398", new Object[]{this, list});
        } else {
            this.list = list;
        }
    }

    public final void setMaxZoom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21494a4", new Object[]{this, new Float(f)});
        } else {
            this.maxZoom = f;
        }
    }

    public final void setPullDownEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef8f0c1", new Object[]{this, new Boolean(z)});
        } else {
            this.pullDownEnable = z;
        }
    }

    public final void setPullDownOffset(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5033509d", new Object[]{this, new Float(f)});
        } else {
            this.pullDownOffset = f;
        }
    }
}
