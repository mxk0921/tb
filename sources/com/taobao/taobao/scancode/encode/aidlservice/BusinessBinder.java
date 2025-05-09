package com.taobao.taobao.scancode.encode.aidlservice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.IEncodeService;
import com.taobao.taobao.scancode.encode.api.EncodeSyncApi;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import tb.ey3;
import tb.gso;
import tb.t2o;
import tb.xxh;
import tb.zxh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BusinessBinder extends IEncodeService.Stub {
    private static final int qrColor = -16777216;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<Bitmap, Void, MaResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12911a;
        public final /* synthetic */ DecodeCallback b;

        public a(BusinessBinder businessBinder, int i, DecodeCallback decodeCallback) {
            this.f12911a = i;
            this.b = decodeCallback;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/encode/aidlservice/BusinessBinder$1");
        }

        /* renamed from: a */
        public MaResult doInBackground(Bitmap... bitmapArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MaResult) ipChange.ipc$dispatch("7d3a1188", new Object[]{this, bitmapArr});
            }
            MaType maType = MaType.QR;
            int i = this.f12911a;
            if (i == 0) {
                maType = MaType.PRODUCT;
            } else if (i == 1) {
                return xxh.d(bitmapArr[0], maType, MaType.GEN3);
            } else {
                if (i == 2) {
                    maType = MaType.EXPRESS;
                }
            }
            return xxh.d(bitmapArr[0], maType);
        }

        /* renamed from: b */
        public void onPostExecute(MaResult maResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a86a0bd", new Object[]{this, maResult});
                return;
            }
            try {
                if (maResult == null || maResult.getText() == null) {
                    this.b.onError(new EncodeError(this.f12911a, "masult == null"));
                    return;
                }
                DecodeCallback decodeCallback = this.b;
                if (decodeCallback instanceof GEN3DecodeCallback) {
                    ((GEN3DecodeCallback) decodeCallback).a(maResult.getType().getDiscernType());
                }
                this.b.onSuccess(maResult.getText());
            } catch (RemoteException unused) {
            }
        }
    }

    static {
        t2o.a(760217654);
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void decodeBitmap(byte[] bArr, int i, DecodeCallback decodeCallback) throws RemoteException {
        ey3.g().h("Encode_Aidl_decode_bitmap");
        if (decodeCallback != null) {
            if (bArr == null) {
                decodeCallback.onError(new EncodeError(i, "imageData==null"));
                return;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (decodeByteArray == null) {
                decodeCallback.onError(new EncodeError(i, "imageBitmap==null"));
            } else {
                new a(this, i, decodeCallback).execute(decodeByteArray);
            }
        }
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public String decodeLocalPath(String str) {
        return decodeLocalPathWithType(str, 36607);
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public String decodeLocalPathWithType(String str, int i) {
        ey3.g().h("Encode_Aidl_decode_from_local");
        MaResult f = xxh.f(str, i, null);
        if (f == null || f.getText() == null) {
            return null;
        }
        return f.getText();
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void encode(String str, String str2, int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) throws RemoteException {
        gso.c("call:encode api :imageUrl" + str + "\ntext:" + str2 + "\nmaType: " + i + "\nmaSizeType:" + maSizeType.x + "," + maSizeType.y + "\nneedToShortURL:" + z, new Object[0]);
        new EncodeSyncApi().k(str, str2, i, maSizeType, z, encodeCallback);
        ey3.g().h("Encode_Aidl_encode");
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void encodeMa2(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback) throws RemoteException {
        encodeMa3(i, bArr, i2, i3, str, i4, i5, i6, c, i7, encodeCallback, -16777216);
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void encodeMa3(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback, int i8) throws RemoteException {
        gso.c("call:encodeMa3 api :type" + i + "\nlogoWidth:" + i2 + "\nlogoHeight: " + i3 + "\ncontent:" + str + "\nlogoChannel:" + i4 + "\n_margin:" + i5 + "\n_qrSize:" + i6 + "\necl:" + c + "\nversion:" + i7 + "\n_qrColor:" + i8, new Object[0]);
        if (i != 1) {
            encodeCallback.onError(new EncodeError(i, "no impl"));
        } else if (bArr == null || str == null) {
            encodeCallback.onError(new EncodeError(i, "logoData=null"));
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outHeight = i3;
            options.outWidth = i2;
            encodeCallback.onSuccess(new BitmapHolder(zxh.c(str, i8, BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), i5, i6, c, i7 <= 0 ? 4 : i7)));
        }
    }
}
