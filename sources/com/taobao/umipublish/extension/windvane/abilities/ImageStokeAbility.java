package com.taobao.umipublish.extension.windvane.abilities;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.marvel.Exporter;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taopai.material.bean.MaterialResource;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.cg9;
import tb.ckf;
import tb.ed2;
import tb.fkg;
import tb.grc;
import tb.i8g;
import tb.k7i;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.u1a;
import tb.v7i;
import tb.vbm;
import tb.vyl;
import tb.xhv;
import tb.ydv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J=\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility;", "Lcom/taobao/umipublish/extension/windvane/abilities/BaseAbility;", "<init>", "()V", "", "marvelJSONPath", "Ltb/xhv;", "strokeImageAndExport", "(Ljava/lang/String;)V", "checkIfFinished", "marvelPath", "imagePath", "Lkotlin/Function2;", "success", "(Ljava/lang/String;Ljava/lang/String;Ltb/u1a;)V", "Lcom/alibaba/marvel/MeEditor;", "editor", "findMainClipId", "(Lcom/alibaba/marvel/MeEditor;)Ljava/lang/String;", "Lcom/alibaba/fastjson/JSONObject;", "params", "onExecute", "(Lcom/alibaba/fastjson/JSONObject;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "", "Lcom/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$Image;", BaseJsExecutor.NAME_IMAGE_LIST, "Ljava/util/List;", "", "limitSize", TLogTracker.LEVEL_INFO, "", "base64Encode", "Z", vbm.TYPE_IMAGE, "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ImageStokeAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean base64Encode;
    private final String TAG = "ImageStokeAbility";
    private List<Image> imageList = new ArrayList();
    private int limitSize = 1024;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$Image;", "", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Image {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f14058a;
        public String b;
        public String c;

        static {
            t2o.a(944767159);
        }

        public Image(String str, String str2, String str3) {
            ckf.g(str, "inputPath");
            this.f14058a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aa2fbbd4", new Object[]{this});
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f3a2e440", new Object[]{this});
            }
            return this.f14058a;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9a76fbbd", new Object[]{this});
            }
            return this.b;
        }

        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b71ac22", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b520359", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }
    }

    static {
        t2o.a(944767158);
    }

    public static final /* synthetic */ void access$checkIfFinished(ImageStokeAbility imageStokeAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a3d12e", new Object[]{imageStokeAbility});
        } else {
            imageStokeAbility.checkIfFinished();
        }
    }

    public static final /* synthetic */ boolean access$getBase64Encode$p(ImageStokeAbility imageStokeAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fadafe22", new Object[]{imageStokeAbility})).booleanValue();
        }
        return imageStokeAbility.base64Encode;
    }

    public static final /* synthetic */ String access$getTAG$p(ImageStokeAbility imageStokeAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34d40ab9", new Object[]{imageStokeAbility});
        }
        return imageStokeAbility.TAG;
    }

    public static final /* synthetic */ void access$setBase64Encode$p(ImageStokeAbility imageStokeAbility, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565430ea", new Object[]{imageStokeAbility, new Boolean(z)});
        } else {
            imageStokeAbility.base64Encode = z;
        }
    }

    public static final /* synthetic */ void access$strokeImageAndExport(ImageStokeAbility imageStokeAbility, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87283449", new Object[]{imageStokeAbility, str});
        } else {
            imageStokeAbility.strokeImageAndExport(str);
        }
    }

    private final void checkIfFinished() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5d9cde", new Object[]{this});
            return;
        }
        List<Image> list = this.imageList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Image image = (Image) obj;
                if (TextUtils.isEmpty(image.c()) && TextUtils.isEmpty(image.a())) {
                    arrayList.add(obj);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return;
        }
        if (this.base64Encode) {
            JSONArray jSONArray = new JSONArray();
            List<Image> list2 = this.imageList;
            if (list2 != null) {
                for (Image image2 : list2) {
                    jSONArray.add(image2.a());
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imageBase64Infos", (Object) jSONArray);
            odg.d(this.TAG, "ImageStokeAbility.strokeImageAndExport.Success.Base64");
            successCallback(jSONObject);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        List<Image> list3 = this.imageList;
        if (list3 != null) {
            for (Image image3 : list3) {
                jSONArray2.add(image3.c());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("imagePaths", (Object) jSONArray2);
        odg.d(this.TAG, "ImageStokeAbility.strokeImageAndExport.Success");
        successCallback(jSONObject2);
    }

    public static /* synthetic */ Object ipc$super(ImageStokeAbility imageStokeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility");
    }

    private final void strokeImageAndExport(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339d5639", new Object[]{this, str});
            return;
        }
        List<Image> list = this.imageList;
        if (list != null) {
            for (Image image : list) {
                strokeImageAndExport(str, image.b(), new ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1(image, this, str));
            }
        }
    }

    private final String findMainClipId(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69402e57", new Object[]{this, meEditor});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        meEditor.getTrackIdList("main", arrayList);
        meEditor.getClipIdList((String) arrayList.get(0), arrayList2);
        return (String) arrayList2.get(0);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        JSONArray<Object> a2 = qrf.a(jSONObject, "imagePaths");
        ArrayList arrayList = null;
        if (a2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : a2) {
                arrayList2.add(new Image(obj.toString(), null, null));
            }
            arrayList = arrayList2;
        }
        this.imageList = arrayList;
        this.limitSize = qrf.h(jSONObject, "limitSize", 1024);
        this.base64Encode = qrf.b(jSONObject, "base64Encode", false);
        List<Image> list = this.imageList;
        if (list == null || !list.isEmpty()) {
            v7i v7iVar = new v7i(ydv.n());
            v7iVar.h(true);
            v7iVar.f(vyl.MAX_COMMIT_TIME_INTERVAL);
            v7iVar.g(fkg.LE_VERSION);
            odg.d(this.TAG, "ImageStokeAbility.downloadMaterialRes.Start");
            new k7i(this.mContext, "guangguang", "guangguang").D(Globals.getApplication(), v7iVar, new grc() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility$onExecute$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pjd
                public void onFail(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                        return;
                    }
                    String access$getTAG$p = ImageStokeAbility.access$getTAG$p(ImageStokeAbility.this);
                    odg.c(access$getTAG$p, "ImageStokeAbility.downloadMaterialRes.onFail: errorCode:" + str + ", errorInfo:" + str2);
                    ImageStokeAbility.this.errorCallback(str, str2);
                }

                @Override // tb.grc
                public void onProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // tb.grc
                public void onSuccess(MaterialResource materialResource) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("63df5368", new Object[]{this, materialResource});
                        return;
                    }
                    if (materialResource != null) {
                        str = materialResource.getDirPath();
                    } else {
                        str = null;
                    }
                    String p = ckf.p(str, "/marvel.json");
                    if (!cg9.l(p)) {
                        String access$getTAG$p = ImageStokeAbility.access$getTAG$p(ImageStokeAbility.this);
                        odg.c(access$getTAG$p, "ImageStokeAbility.downloadMaterialRes.FileNotExist: marvelJSONPath:" + p);
                        ImageStokeAbility.this.errorCallback("MAIFileNotExist", "MAIFileNotExist");
                        return;
                    }
                    String access$getTAG$p2 = ImageStokeAbility.access$getTAG$p(ImageStokeAbility.this);
                    odg.d(access$getTAG$p2, "ImageStokeAbility.downloadMaterialRes.onSuccess: marvelJSONPath:" + p);
                    ImageStokeAbility.access$strokeImageAndExport(ImageStokeAbility.this, p);
                }
            });
            return;
        }
        errorCallback("EmptyInputImages", "EmptyInputImages");
    }

    private final void strokeImageAndExport(String str, String str2, final u1a<? super String, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f739e8", new Object[]{this, str, str2, u1aVar});
            return;
        }
        final int i = this.limitSize;
        Project createProject = Marvel.createProject();
        createProject.load(str, (ResourceInspector) null);
        MeEditor meEditor = createProject.getMeEditor();
        Exporter imageExporter = new ImageExporter();
        ckf.f(meEditor, "editor");
        String findMainClipId = findMainClipId(meEditor);
        meEditor.setCanvasSize(1024, 1024);
        meEditor.changeClipRes(findMainClipId, str2, (Map) null);
        imageExporter.setWidth(i);
        imageExporter.setHeight(i);
        imageExporter.setCompressFormat(Bitmap.CompressFormat.PNG);
        imageExporter.setBackgroundColor(0L);
        imageExporter.setBitmapListener(new ImageExporter.c() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility$strokeImageAndExport$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public final void a(long j, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b1d61e62", new Object[]{this, new Long(j), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), byteBuffer});
                    return;
                }
                int i6 = i;
                Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(byteBuffer);
                if (ImageStokeAbility.access$getBase64Encode$p(ImageStokeAbility.this)) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    u1aVar.invoke(null, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                    return;
                }
                String g = i8g.g(ImageStokeAbility.this.mContext);
                ed2.s(createBitmap, g, 90, true);
                u1aVar.invoke(g, null);
            }
        });
        createProject.export(imageExporter);
    }
}
