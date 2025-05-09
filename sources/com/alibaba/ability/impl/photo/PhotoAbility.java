package com.alibaba.ability.impl.photo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.impl.TransParentActivity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsPhotoAbility;
import com.taobao.android.abilityidl.ability.PhotoMediaFiles;
import com.taobao.android.abilityidl.ability.PhotoSaveToAlbumFinishResult;
import com.taobao.android.abilityidl.ability.PhotoSuccessResult;
import com.taobao.android.pissarro.remote.TaopaiLoadConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.a2m;
import tb.b2m;
import tb.c2m;
import tb.ckf;
import tb.dov;
import tb.eji;
import tb.f2m;
import tb.gl4;
import tb.joe;
import tb.jpu;
import tb.kdb;
import tb.s0m;
import tb.s6u;
import tb.t2o;
import tb.t4p;
import tb.u8d;
import tb.v3i;
import tb.v8d;
import tb.w8d;
import tb.woe;
import tb.x8d;
import tb.xbt;
import tb.xhv;
import tb.y1m;
import tb.ywo;
import tb.z1m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PhotoAbility extends AbsPhotoAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public s6u f2010a = new s6u();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f2011a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ FrameLayout.LayoutParams c;

        public a(Application application, ImageView imageView, FrameLayout.LayoutParams layoutParams) {
            this.f2011a = application;
            this.b = imageView;
            this.c = layoutParams;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            Intent intent = activity.getIntent();
            if (ckf.b((intent == null || (data = intent.getData()) == null) ? null : data.getPath(), "/taopai/socialrecord_refactor.html")) {
                Window window = activity.getWindow();
                ckf.f(window, "activity.window");
                View decorView = window.getDecorView();
                if (decorView != null) {
                    ((FrameLayout) decorView).addView(this.b, this.c);
                    this.f2011a.unregisterActivityLifecycleCallbacks(this);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ kdb d;
        public final /* synthetic */ v8d e;

        public b(List list, Context context, kdb kdbVar, v8d v8dVar) {
            this.b = list;
            this.c = context;
            this.d = kdbVar;
            this.e = v8dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
            if (r8 != null) goto L_0x0090;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 689
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.photo.PhotoAbility.b.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d extends joe {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ u8d f;
        public final /* synthetic */ Context g;
        public final /* synthetic */ z1m h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements joe.a<JSONArray> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: b */
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("249940a0", new Object[]{this, jSONArray});
                } else if (jSONArray == null || jSONArray.isEmpty()) {
                    d.this.f.O(new ErrorResult("TAKE_PHOTO_ERROR", "take photo failed,data empty", (Map) null, 4, (a07) null));
                } else {
                    new JSONObject().put((JSONObject) "mediaFiles", (String) jSONArray);
                    d dVar = d.this;
                    dVar.f.A0(PhotoAbility.access$getPhotoSuccessResult(PhotoAbility.this, jSONArray));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u8d u8dVar, Context context, z1m z1mVar, Uri uri, int i) {
            super(uri, i, null, 4, null);
            this.f = u8dVar;
            this.g = context;
            this.h = z1mVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/photo/PhotoAbility$takeFromCamera$intent$1");
        }

        @Override // tb.joe
        public void e(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5f10adf", new Object[]{this, jSONArray});
            } else if (jSONArray == null) {
                this.f.O(new ErrorResult("USER_CANCELED", "user canceled", (Map) null, 4, (a07) null));
            } else {
                Context context = this.g;
                boolean b = ckf.b(this.h.i, "true");
                boolean b2 = ckf.b(this.h.j, "true");
                z1m z1mVar = this.h;
                String str = z1mVar.d;
                String str2 = str != null ? str : "";
                String str3 = z1mVar.e;
                String str4 = str3 != null ? str3 : "";
                Integer num = z1mVar.g;
                if (num == null) {
                    num = 1048576;
                }
                int intValue = num.intValue();
                Integer num2 = this.h.f;
                if (num2 == null) {
                    num2 = Integer.valueOf((int) y1m.MAX_VIDEO_SIZE);
                }
                h(context, jSONArray, b, b2, str2, str4, intValue, num2.intValue(), PhotoAbility.this.getExporter(), new a());
            }
        }

        @Override // tb.joe
        public void g(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            this.f.O(errorResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e extends joe {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ u8d f;
        public final /* synthetic */ Context g;
        public final /* synthetic */ z1m h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements joe.a<JSONArray> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: b */
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("249940a0", new Object[]{this, jSONArray});
                } else if (jSONArray == null || jSONArray.isEmpty()) {
                    e.this.f.O(new ErrorResult("SELECT_ERROR", "choose from album failed,data empty", (Map) null, 4, (a07) null));
                } else {
                    new JSONObject().put((JSONObject) "mediaFiles", (String) jSONArray);
                    e eVar = e.this;
                    eVar.f.A0(PhotoAbility.access$getPhotoSuccessResult(PhotoAbility.this, jSONArray));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u8d u8dVar, Context context, z1m z1mVar, Ref$ObjectRef ref$ObjectRef, int i, Uri uri, int i2) {
            super(uri, i2, null, 4, null);
            this.f = u8dVar;
            this.g = context;
            this.h = z1mVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/photo/PhotoAbility$takeFromPhotoLibrary$intent$1");
        }

        @Override // tb.joe
        public void e(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5f10adf", new Object[]{this, jSONArray});
            } else if (jSONArray == null) {
                this.f.O(new ErrorResult("USER_CANCELED", "user canceled", (Map) null, 4, (a07) null));
            } else {
                Context context = this.g;
                boolean parseBoolean = Boolean.parseBoolean(this.h.i);
                boolean parseBoolean2 = Boolean.parseBoolean(this.h.j);
                z1m z1mVar = this.h;
                String str = z1mVar.d;
                String str2 = str != null ? str : "";
                String str3 = z1mVar.e;
                String str4 = str3 != null ? str3 : "";
                Integer num = z1mVar.g;
                if (num == null) {
                    num = 1048576;
                }
                int intValue = num.intValue();
                Integer num2 = this.h.f;
                if (num2 == null) {
                    num2 = Integer.valueOf((int) y1m.MAX_VIDEO_SIZE);
                }
                h(context, jSONArray, parseBoolean, parseBoolean2, str2, str4, intValue, num2.intValue(), PhotoAbility.this.getExporter(), new a());
            }
        }

        @Override // tb.joe
        public void g(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            this.f.O(errorResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f extends joe {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x8d e;
        public final /* synthetic */ Context f;
        public final /* synthetic */ f2m g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x8d x8dVar, Context context, f2m f2mVar, Intent intent, Uri uri, int i, Intent intent2) {
            super(uri, i, intent2);
            this.e = x8dVar;
            this.f = context;
            this.g = f2mVar;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/photo/PhotoAbility$takeFromScreen$1");
        }

        @Override // tb.joe
        public void d(Intent intent, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe6ac0f7", new Object[]{this, intent, num});
            } else if (intent == null) {
                this.e.O(new ErrorResult("USER_CANCELED", "screen capture failed", (Map) null, 4, (a07) null));
            } else {
                Intent intent2 = new Intent(this.f, CaptureService.class);
                if (num != null && num.intValue() == -1) {
                    intent2.putExtra("data", intent);
                    Boolean bool = this.g.f18963a;
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    intent2.putExtra("saveToAlbum", bool.booleanValue());
                    if (Build.VERSION.SDK_INT >= 26) {
                        CaptureService.Companion.a(intent2, this.f, this.e);
                    } else {
                        CaptureService.Companion.b(intent2, this.f, this.e);
                    }
                } else {
                    this.e.O(new ErrorResult("USER_CANCELED", "user canceled", (Map) null, 4, (a07) null));
                }
            }
        }

        @Override // tb.joe
        public void g(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            this.e.O(errorResult);
        }
    }

    static {
        t2o.a(126877715);
    }

    public static final /* synthetic */ PhotoSuccessResult access$getPhotoSuccessResult(PhotoAbility photoAbility, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoSuccessResult) ipChange.ipc$dispatch("5f24af5d", new Object[]{photoAbility, jSONArray});
        }
        return photoAbility.d(jSONArray);
    }

    public static /* synthetic */ Object ipc$super(PhotoAbility photoAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/photo/PhotoAbility");
    }

    public final Uri b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b6d17c7d", new Object[]{this, new Boolean(z), str});
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/socialrecord.html").appendQueryParameter(dov.KEY_BIZ_LINE, str).appendQueryParameter("biz_scene", "mega_ability").appendQueryParameter(dov.KEY_MEDIA_TYPE, "photo").appendQueryParameter("use_message_ui", "1");
        if (z) {
            appendQueryParameter.appendQueryParameter("back_camera", "1");
        }
        Uri build = appendQueryParameter.build();
        ckf.f(build, "builder.build()");
        return build;
    }

    public final Uri c(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d65fe705", new Object[]{this, str, str2, str3, new Integer(i)});
        }
        Uri build = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/image_gallery.html").appendQueryParameter("scene", "selectGallery").appendQueryParameter(dov.KEY_BIZ_LINE, str3).appendQueryParameter("biz_scene", "mega_ability").appendQueryParameter("use_message_ui", "1").appendQueryParameter(dov.KEY_MEDIA_TYPE, str).appendQueryParameter("photo_max", str2).appendQueryParameter("max_import_video_size", String.valueOf(i)).build();
        ckf.f(build, "Uri.Builder()\n          …g())\n            .build()");
        return build;
    }

    public final PhotoSuccessResult d(JSONArray jSONArray) {
        PhotoMediaFiles photoMediaFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoSuccessResult) ipChange.ipc$dispatch("82a58dea", new Object[]{this, jSONArray});
        }
        PhotoSuccessResult photoSuccessResult = new PhotoSuccessResult();
        ArrayList arrayList = null;
        if (jSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : jSONArray) {
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    photoMediaFiles = new PhotoMediaFiles();
                    photoMediaFiles.localPath = jSONObject.getString(gl4.CONFIG_LOCAL_PATH);
                    photoMediaFiles.size = jSONObject.getString("size");
                    photoMediaFiles.height = jSONObject.getString("height");
                    photoMediaFiles.width = jSONObject.getString("width");
                    photoMediaFiles.mediaType = jSONObject.getString("mediaType");
                    photoMediaFiles.thumbPath = jSONObject.getString("thumbPath");
                    photoMediaFiles.cdnUrl = jSONObject.getString("cdnUrl");
                    photoMediaFiles.thumbBase64 = jSONObject.getString("thumbBase64");
                    photoMediaFiles.cdnFileId = jSONObject.getString("cdnFileId");
                } else {
                    photoMediaFiles = null;
                }
                if (photoMediaFiles != null) {
                    arrayList2.add(photoMediaFiles);
                }
            }
            arrayList = arrayList2;
        }
        photoSuccessResult.mediaFiles = arrayList;
        return photoSuccessResult;
    }

    public final s6u getExporter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6u) ipChange.ipc$dispatch("f0ae449b", new Object[]{this});
        }
        return this.f2010a;
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f2010a.destroy();
    }

    public final void setExporter(s6u s6uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212401e3", new Object[]{this, s6uVar});
            return;
        }
        ckf.g(s6uVar, "<set-?>");
        this.f2010a = s6uVar;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPhotoAbility
    public void takeFromScreen(kdb kdbVar, f2m f2mVar, x8d x8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650445c1", new Object[]{this, kdbVar, f2mVar, x8dVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(f2mVar, "params");
        ckf.g(x8dVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            Intent intent = new Intent(context, TransParentActivity.class);
            Object systemService = context.getSystemService("media_projection");
            if (systemService != null) {
                Intent createScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
                TransParentActivity.Companion.b(intent, context, new f(x8dVar, context, f2mVar, createScreenCaptureIntent, null, 1003, createScreenCaptureIntent));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        }
        x8dVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f2013a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ w8d c;

        public c(List list, Context context, w8d w8dVar) {
            this.f2013a = list;
            this.b = context;
            this.c = w8dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = this.f2013a.size();
            for (int i = 0; i < size; i++) {
                String str = (String) this.f2013a.get(i);
                String valueOf = String.valueOf(i);
                if (URLUtil.isHttpsUrl(str)) {
                    woe woeVar = woe.INSTANCE;
                    ckf.f(str, "source");
                    bitmap = woeVar.b(str);
                } else if (URLUtil.isDataUrl(str)) {
                    woe woeVar2 = woe.INSTANCE;
                    ckf.f(str, "source");
                    bitmap = woeVar2.a(str);
                } else {
                    arrayList.add(v3i.f(jpu.a(valueOf, "非法数据")));
                }
                if (bitmap == null) {
                    arrayList.add(v3i.f(jpu.a(valueOf, "图片下载失败")));
                } else if (!woe.INSTANCE.f(this.b, bitmap)) {
                    arrayList.add(v3i.f(jpu.a(valueOf, "图片保存失败")));
                }
            }
            w8d w8dVar = this.c;
            PhotoSaveToAlbumFinishResult photoSaveToAlbumFinishResult = new PhotoSaveToAlbumFinishResult();
            photoSaveToAlbumFinishResult.failSrcs = arrayList;
            xhv xhvVar = xhv.INSTANCE;
            w8dVar.r(photoSaveToAlbumFinishResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPhotoAbility
    public void takeFromCamera(kdb kdbVar, z1m z1mVar, u8d u8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505470b4", new Object[]{this, kdbVar, z1mVar, u8dVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(z1mVar, "params");
        ckf.g(u8dVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            u8dVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        } else if (ContextCompat.checkSelfPermission(context, t4p.CAMERA) != 0) {
            u8dVar.O(new ErrorResult("NO_PERMISSION", "NoPermission", (Map) null, 4, (a07) null));
        } else {
            Intent a2 = TransParentActivity.Companion.a(new Intent(context, TransParentActivity.class), new d(u8dVar, context, z1mVar, b(ckf.b("back", z1mVar.c), z1mVar.f32463a), 1001));
            if (!xbt.c()) {
                xbt.a(context, new TaopaiLoadConfig.b().p(z1mVar.f32463a).s(a2).l(), true);
            } else {
                context.startActivity(a2);
            }
            String str = z1mVar.k;
            Double d2 = z1mVar.l;
            Integer num = null;
            Integer valueOf = d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null;
            Double d3 = z1mVar.m;
            if (d3 != null) {
                num = Integer.valueOf((int) d3.doubleValue());
            }
            a(context, str, valueOf, num);
        }
    }

    public final void a(Context context, String str, Integer num, Integer num2) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6f6f19", new Object[]{this, context, str, num, num2});
            return;
        }
        int intValue = num != null ? num.intValue() : -1;
        int intValue2 = num2 != null ? num2.intValue() : -1;
        boolean z2 = (str == null || str.length() == 0) | (intValue == -1);
        if (intValue2 != -1) {
            z = false;
        }
        if (!z && !z2) {
            DisplayMetrics b2 = ywo.b(context);
            int i2 = b2.widthPixels;
            int i3 = b2.heightPixels;
            float f2 = i3 / (i2 * 1.0f);
            if (intValue == intValue2) {
                i = i2;
            } else {
                if (intValue > intValue2) {
                    int i4 = intValue ^ intValue2;
                    intValue2 ^= i4;
                    intValue = i4 ^ intValue2;
                }
                float f3 = intValue2;
                float f4 = intValue * 1.0f;
                if (f3 / f4 < f2) {
                    i = (int) ((intValue2 * i2) / f4);
                } else {
                    i2 = (int) ((intValue * i3) / (f3 * 1.0f));
                    i = i3;
                }
            }
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i);
            layoutParams.gravity = 17;
            try {
                s0m.B().T(str).into(imageView);
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                Application application = (Application) applicationContext;
                application.registerActivityLifecycleCallbacks(new a(application, imageView, layoutParams));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPhotoAbility
    public void saveMediaToAlbum(kdb kdbVar, a2m a2mVar, v8d v8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70dffa75", new Object[]{this, kdbVar, a2mVar, v8dVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(a2mVar, "params");
        ckf.g(v8dVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            List<b2m> list = a2mVar.f15510a;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    eji.j(y1m.a(), new b(list, context, kdbVar, v8dVar), 0L, null, 6, null);
                    return;
                }
            }
            v8dVar.O(new ErrorResult("400", "medias is empty", (Map) null, 4, (a07) null));
            return;
        }
        v8dVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPhotoAbility
    public void saveToAlbum(kdb kdbVar, c2m c2mVar, w8d w8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ab273a", new Object[]{this, kdbVar, c2mVar, w8dVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(c2mVar, "params");
        ckf.g(w8dVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            List<String> list = c2mVar.f16794a;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    eji.j(y1m.a(), new c(list, context, w8dVar), 0L, null, 6, null);
                    return;
                }
            }
            w8dVar.O(new ErrorResult("USER_CANCELED", "sources empty", (Map) null, 4, (a07) null));
            return;
        }
        w8dVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.android.abilityidl.ability.AbsPhotoAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void takeFromPhotoLibrary(tb.kdb r17, tb.z1m r18, tb.u8d r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.photo.PhotoAbility.takeFromPhotoLibrary(tb.kdb, tb.z1m, tb.u8d):void");
    }
}
