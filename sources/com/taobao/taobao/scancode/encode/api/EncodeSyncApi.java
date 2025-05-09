package com.taobao.taobao.scancode.encode.api;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateResponse;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateResponseData;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.h1p;
import tb.o68;
import tb.oby;
import tb.ple;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.zxh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class EncodeSyncApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile Bitmap b;
    public volatile String c;
    public volatile String d;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f12916a = false;
    public volatile boolean e = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f12917a;

        public a(EncodeSyncApi encodeSyncApi, CountDownLatch countDownLatch) {
            this.f12917a = countDownLatch;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            Versions.isDebug();
            this.f12917a.countDown();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f12918a;

        public b(CountDownLatch countDownLatch) {
            this.f12918a = countDownLatch;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable == null || drawable.getBitmap() == null) {
                return false;
            }
            try {
                EncodeSyncApi.b(EncodeSyncApi.this, ple.b(drawable));
                if (EncodeSyncApi.a(EncodeSyncApi.this) != null) {
                    EncodeSyncApi.d(EncodeSyncApi.this, true);
                }
                return true;
            } finally {
                this.f12918a.countDown();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f12919a;
        public final /* synthetic */ int b;
        public final /* synthetic */ MaSizeType c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ EncodeCallback f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, CountDownLatch countDownLatch, int i, MaSizeType maSizeType, String str2, String str3, EncodeCallback encodeCallback) {
            super(str);
            this.f12919a = countDownLatch;
            this.b = i;
            this.c = maSizeType;
            this.d = str2;
            this.e = str3;
            this.f = encodeCallback;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/encode/api/EncodeSyncApi$4");
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01e9 -> B:83:0x01ec). Please submit an issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            char c;
            Bitmap bitmap2;
            Bitmap bitmap3;
            Bitmap bitmap4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f12919a.await(60L, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!EncodeSyncApi.c(EncodeSyncApi.this) || EncodeSyncApi.a(EncodeSyncApi.this) == null || EncodeSyncApi.g(EncodeSyncApi.this) == null || (!EncodeSyncApi.e(EncodeSyncApi.this) && this.b == 3)) {
                try {
                    Versions.isDebug();
                    BitmapHolder c2 = ple.c(EncodeSyncApi.i(EncodeSyncApi.this), Integer.valueOf(this.c.size));
                    Versions.isDebug();
                    if (c2 == null || (bitmap = c2.encodeResult) == null) {
                        this.f.onError(new EncodeError(-2));
                    } else {
                        oby.c(bitmap, this.d, this.e);
                        this.f.onSuccess(c2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                if (EncodeSyncApi.a(EncodeSyncApi.this).getWidth() < this.c.size) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(this.c.size / EncodeSyncApi.a(EncodeSyncApi.this).getWidth(), this.c.size / EncodeSyncApi.a(EncodeSyncApi.this).getHeight());
                    if (!EncodeSyncApi.a(EncodeSyncApi.this).isRecycled()) {
                        try {
                            EncodeSyncApi.b(EncodeSyncApi.this, Bitmap.createBitmap(EncodeSyncApi.a(EncodeSyncApi.this), 0, 0, EncodeSyncApi.a(EncodeSyncApi.this).getWidth(), EncodeSyncApi.a(EncodeSyncApi.this).getHeight(), matrix, true));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Versions.isDebug();
                try {
                    if (this.b == 0) {
                        BitmapHolder c3 = ple.c(EncodeSyncApi.i(EncodeSyncApi.this), Integer.valueOf(this.c.size));
                        Versions.isDebug();
                        if (c3 == null || (bitmap4 = c3.encodeResult) == null) {
                            this.f.onError(new EncodeError(-1));
                        } else {
                            oby.c(bitmap4, this.d, this.e);
                            this.f.onSuccess(c3);
                        }
                        if (EncodeSyncApi.a(EncodeSyncApi.this) != null && !EncodeSyncApi.a(EncodeSyncApi.this).isRecycled()) {
                            EncodeSyncApi.a(EncodeSyncApi.this).recycle();
                            EncodeSyncApi.b(EncodeSyncApi.this, null);
                            return;
                        }
                        return;
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (!TextUtils.isEmpty(EncodeSyncApi.g(EncodeSyncApi.this))) {
                    c = EncodeSyncApi.g(EncodeSyncApi.this).charAt(0);
                } else {
                    c = '0';
                }
                if (this.b == 3) {
                    EncodeSyncApi encodeSyncApi = EncodeSyncApi.this;
                    EncodeSyncApi.h(encodeSyncApi, EncodeSyncApi.g(encodeSyncApi).substring(1, EncodeSyncApi.g(EncodeSyncApi.this).length()));
                }
                if (this.b == 3) {
                    bitmap2 = zxh.b(EncodeSyncApi.g(EncodeSyncApi.this), EncodeSyncApi.a(EncodeSyncApi.this), 2, c, 4);
                } else {
                    bitmap2 = null;
                }
                try {
                    if (bitmap2 != null) {
                        oby.c(bitmap2, this.d, this.e);
                        this.f.onSuccess(new BitmapHolder(bitmap2));
                    } else {
                        BitmapHolder c4 = ple.c(EncodeSyncApi.i(EncodeSyncApi.this), Integer.valueOf(this.c.size));
                        if (c4 == null || (bitmap3 = c4.encodeResult) == null) {
                            this.f.onError(new EncodeError(-1));
                        } else {
                            oby.c(bitmap3, this.d, this.e);
                            this.f.onSuccess(c4);
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (EncodeSyncApi.a(EncodeSyncApi.this) != null && !EncodeSyncApi.a(EncodeSyncApi.this).isRecycled()) {
                EncodeSyncApi.a(EncodeSyncApi.this).recycle();
                EncodeSyncApi.b(EncodeSyncApi.this, null);
            }
        }
    }

    static {
        t2o.a(760217660);
    }

    public static /* synthetic */ Bitmap a(EncodeSyncApi encodeSyncApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("94bdfd36", new Object[]{encodeSyncApi});
        }
        return encodeSyncApi.b;
    }

    public static /* synthetic */ Bitmap b(EncodeSyncApi encodeSyncApi, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f396b136", new Object[]{encodeSyncApi, bitmap});
        }
        encodeSyncApi.b = bitmap;
        return bitmap;
    }

    public static /* synthetic */ boolean c(EncodeSyncApi encodeSyncApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfd01bb", new Object[]{encodeSyncApi})).booleanValue();
        }
        return encodeSyncApi.f12916a;
    }

    public static /* synthetic */ boolean d(EncodeSyncApi encodeSyncApi, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f30f8183", new Object[]{encodeSyncApi, new Boolean(z)})).booleanValue();
        }
        encodeSyncApi.f12916a = z;
        return z;
    }

    public static /* synthetic */ boolean e(EncodeSyncApi encodeSyncApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f400cd1a", new Object[]{encodeSyncApi})).booleanValue();
        }
        return encodeSyncApi.e;
    }

    public static /* synthetic */ boolean f(EncodeSyncApi encodeSyncApi, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad852204", new Object[]{encodeSyncApi, new Boolean(z)})).booleanValue();
        }
        encodeSyncApi.e = z;
        return z;
    }

    public static /* synthetic */ String g(EncodeSyncApi encodeSyncApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ca4b4cb", new Object[]{encodeSyncApi});
        }
        return encodeSyncApi.c;
    }

    public static /* synthetic */ String h(EncodeSyncApi encodeSyncApi, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e983c83", new Object[]{encodeSyncApi, str});
        }
        encodeSyncApi.c = str;
        return str;
    }

    public static /* synthetic */ String i(EncodeSyncApi encodeSyncApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d73334c", new Object[]{encodeSyncApi});
        }
        return encodeSyncApi.d;
    }

    public static /* synthetic */ String j(EncodeSyncApi encodeSyncApi, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6de7cc4", new Object[]{encodeSyncApi, str});
        }
        encodeSyncApi.d = str;
        return str;
    }

    public void k(String str, String str2, final int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) {
        boolean z2;
        String str3;
        final CountDownLatch countDownLatch;
        Bitmap b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7b85b6", new Object[]{this, str, str2, new Integer(i), maSizeType, new Boolean(z), encodeCallback});
        } else if (encodeCallback != null) {
            if (TextUtils.isEmpty(str2)) {
                try {
                    encodeCallback.onError(new EncodeError(-3));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (TextUtils.isEmpty(str) || (b2 = oby.b(str, str2)) == null) {
                this.c = str2;
                this.d = str2;
                this.e = !z;
                if (str.contains(h1p.HTTP_PREFIX) || str.contains(h1p.HTTPS_PREFIX)) {
                    if (maSizeType.size == 0 || (str3 = ImageStrategyDecider.decideUrl(str, Integer.valueOf(maSizeType.size), Integer.valueOf(maSizeType.size), ImageStrategyConfig.v("default", 51).a())) == null) {
                        str3 = str;
                    }
                    z2 = true;
                } else {
                    str3 = str;
                    z2 = false;
                }
                if (z2 && z) {
                    countDownLatch = new CountDownLatch(2);
                } else if (z2 || z) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = new CountDownLatch(0);
                }
                if (!z2) {
                    this.b = ple.d(str3);
                    if (this.b != null) {
                        this.f12916a = true;
                    } else {
                        BitmapHolder c2 = ple.c(str2, Integer.valueOf(maSizeType.size));
                        if (c2 == null || c2.encodeResult == null) {
                            try {
                                encodeCallback.onError(new EncodeError(-3));
                                return;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        } else {
                            try {
                                encodeCallback.onSuccess(c2);
                                return;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                return;
                            }
                        }
                    }
                } else {
                    s0m.B().N0(Globals.getApplication()).T(str3).succListener(new b(countDownLatch)).failListener(new a(this, countDownLatch)).fetch();
                }
                if (z) {
                    new o68().a(str2, new IRemoteBaseListener() { // from class: com.taobao.taobao.scancode.encode.api.EncodeSyncApi.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                return;
                            }
                            if (Versions.isDebug()) {
                                new StringBuilder("mtop false~~~~~~~~~").append(mtopResponse.toString());
                            }
                            countDownLatch.countDown();
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            if (mtopResponse != null && Versions.isDebug()) {
                                mtopResponse.toString();
                            }
                            if (baseOutDo != null && Versions.isDebug()) {
                                baseOutDo.toString();
                            }
                            if (baseOutDo == null) {
                                countDownLatch.countDown();
                                return;
                            }
                            ComTaobaoXcodeQrcodeCreateResponseData data = ((ComTaobaoXcodeQrcodeCreateResponse) baseOutDo).getData();
                            if (!TextUtils.isEmpty(data.shortUrl)) {
                                EncodeSyncApi.f(EncodeSyncApi.this, true);
                                EncodeSyncApi.h(EncodeSyncApi.this, data.shortUrl);
                                EncodeSyncApi.j(EncodeSyncApi.this, data.shortUrl);
                            }
                            if (!TextUtils.isEmpty(data.shortName) && i == 3) {
                                EncodeSyncApi.h(EncodeSyncApi.this, data.shortName);
                            }
                            if (Versions.isDebug()) {
                                mtopResponse.toString();
                            }
                            countDownLatch.countDown();
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                return;
                            }
                            if (Versions.isDebug()) {
                                new StringBuilder("mtop system false~~~~~~~~~").append(mtopResponse.toString());
                            }
                            countDownLatch.countDown();
                        }
                    });
                }
                Coordinator.postTask(new c("scanCode", countDownLatch, i, maSizeType, str, str2, encodeCallback));
            } else {
                try {
                    encodeCallback.onSuccess(new BitmapHolder(b2));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}
