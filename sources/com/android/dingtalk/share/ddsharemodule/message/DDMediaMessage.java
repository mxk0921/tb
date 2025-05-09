package com.android.dingtalk.share.ddsharemodule.message;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import java.io.ByteArrayOutputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DDMediaMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CONTENT_LENGTH = 1024;
    private static final int MAX_THUMB_DATA_LENGTH = 32768;
    private static final int MAX_TITLE_LENGTH = 512;
    private static final String TAG = "DDMediaMessage";
    public String mContent;
    public IMediaObject mMediaObject;
    public int mSDKVersion;
    public byte[] mThumbData;
    public String mThumbUrl;
    public String mTitle;
    public String mUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(90177552);
        }

        public static DDMediaMessage fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            DDMediaMessage dDMediaMessage = new DDMediaMessage();
            dDMediaMessage.mSDKVersion = bundle.getInt(ShareConstant.EXTRA_AP_OBJECT_SDK_VERSION);
            dDMediaMessage.mTitle = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_TITLE);
            dDMediaMessage.mContent = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_DESCRIPTION);
            dDMediaMessage.mThumbData = bundle.getByteArray(ShareConstant.EXTRA_AP_OBJECT_THUMB_DATA);
            dDMediaMessage.mThumbUrl = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_THUMB_URL);
            String string = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_IDENTIFIER);
            if (string != null && string.length() > 0) {
                try {
                    IMediaObject iMediaObject = (IMediaObject) Class.forName(string).newInstance();
                    dDMediaMessage.mMediaObject = iMediaObject;
                    iMediaObject.unserialize(bundle);
                    return dDMediaMessage;
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(DDMediaMessage.TAG, "get media object from bundle failed: unknown ident ".concat(string));
                }
            }
            return dDMediaMessage;
        }

        public static Bundle toBundle(DDMediaMessage dDMediaMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65502feb", new Object[]{dDMediaMessage});
            }
            Bundle bundle = new Bundle();
            bundle.putInt(ShareConstant.EXTRA_AP_OBJECT_SDK_VERSION, dDMediaMessage.mSDKVersion);
            bundle.putString(ShareConstant.EXTRA_AP_OBJECT_TITLE, dDMediaMessage.mTitle);
            bundle.putString(ShareConstant.EXTRA_AP_OBJECT_DESCRIPTION, dDMediaMessage.mContent);
            bundle.putByteArray(ShareConstant.EXTRA_AP_OBJECT_THUMB_DATA, dDMediaMessage.mThumbData);
            bundle.putString(ShareConstant.EXTRA_AP_OBJECT_THUMB_URL, dDMediaMessage.mThumbUrl);
            IMediaObject iMediaObject = dDMediaMessage.mMediaObject;
            if (iMediaObject != null) {
                bundle.putString(ShareConstant.EXTRA_AP_OBJECT_IDENTIFIER, iMediaObject.getClass().getName());
                dDMediaMessage.mMediaObject.serialize(bundle);
            }
            return bundle;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IMediaObject {
        public static final int TYPE_IMAGE = 3;
        public static final int TYPE_TEXT = 2;
        public static final int TYPE_WEBPAGE = 1;
        public static final int TYPE_ZHIFUBAO = 0;

        void attachContext(Context context);

        boolean checkArgs();

        int getSupportVersion();

        void serialize(Bundle bundle);

        int type();

        void unserialize(Bundle bundle);
    }

    static {
        t2o.a(90177551);
    }

    public DDMediaMessage() {
        this(null);
    }

    public final void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
            return;
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject != null) {
            iMediaObject.attachContext(context);
        }
    }

    public final boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        byte[] bArr = this.mThumbData;
        if (bArr == null || bArr.length <= 32768) {
            String str = this.mTitle;
            if (str == null || str.length() <= 512) {
                String str2 = this.mContent;
                if (str2 == null || str2.length() <= 1024) {
                    IMediaObject iMediaObject = this.mMediaObject;
                    if (iMediaObject != null) {
                        return iMediaObject.checkArgs();
                    }
                    Log.e(TAG, "checkArgs fail, mediaObject is null");
                    return false;
                }
                Log.e(TAG, "checkArgs fail, content is invalid");
                return false;
            }
            Log.e(TAG, "checkArgs fail, title is invalid");
            return false;
        }
        Log.e(TAG, "checkArgs fail, thumbData is invalid");
        return false;
    }

    public final int getSupportVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue();
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject == null) {
            return Integer.MAX_VALUE;
        }
        return iMediaObject.getSupportVersion();
    }

    public final int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject == null) {
            return 0;
        }
        return iMediaObject.type();
    }

    public final void setThumbImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55002dc0", new Object[]{this, bitmap});
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
            this.mThumbData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DDMediaMessage(IMediaObject iMediaObject) {
        this.mMediaObject = iMediaObject;
    }
}
