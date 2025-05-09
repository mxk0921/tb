package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FontsContractCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";
    @Deprecated
    public static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
    @Deprecated
    public static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FontFamilyResult {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final FontInfo[] mFonts;
        private final int mStatusCode;

        @Deprecated
        public FontFamilyResult(int i, FontInfo[] fontInfoArr) {
            this.mStatusCode = i;
            this.mFonts = fontInfoArr;
        }

        public static FontFamilyResult create(int i, FontInfo[] fontInfoArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontFamilyResult) ipChange.ipc$dispatch("839b1950", new Object[]{new Integer(i), fontInfoArr});
            }
            return new FontFamilyResult(i, fontInfoArr);
        }

        public FontInfo[] getFonts() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontInfo[]) ipChange.ipc$dispatch("27e58f10", new Object[]{this});
            }
            return this.mFonts;
        }

        public int getStatusCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
            }
            return this.mStatusCode;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FontInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        @Deprecated
        public FontInfo(Uri uri, int i, int i2, boolean z, int i3) {
            this.mUri = (Uri) Preconditions.checkNotNull(uri);
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mResultCode = i3;
        }

        public static FontInfo create(Uri uri, int i, int i2, boolean z, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontInfo) ipChange.ipc$dispatch("f4123d07", new Object[]{uri, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)});
            }
            return new FontInfo(uri, i, i2, z, i3);
        }

        public int getResultCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue();
            }
            return this.mResultCode;
        }

        public int getTtcIndex() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("14b7541f", new Object[]{this})).intValue();
            }
            return this.mTtcIndex;
        }

        public Uri getUri() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
            }
            return this.mUri;
        }

        public int getWeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("975182e8", new Object[]{this})).intValue();
            }
            return this.mWeight;
        }

        public boolean isItalic() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("48b52385", new Object[]{this})).booleanValue();
            }
            return this.mItalic;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FontRequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        @Deprecated
        public static final int RESULT_OK = 0;
        public static final int RESULT_SUCCESS = 0;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eae7d66", new Object[]{this, new Integer(i)});
            }
        }

        public void onTypefaceRetrieved(Typeface typeface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71f164ad", new Object[]{this, typeface});
            }
        }
    }

    private FontsContractCompat() {
    }

    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3e9310f4", new Object[]{context, cancellationSignal, fontInfoArr});
        }
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static FontFamilyResult fetchFonts(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontFamilyResult) ipChange.ipc$dispatch("48a44b78", new Object[]{context, cancellationSignal, fontRequest});
        }
        return FontProvider.getFontFamilyResult(context, fontRequest, cancellationSignal);
    }

    @Deprecated
    public static Typeface getFontSync(Context context, FontRequest fontRequest, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("e8c5ad47", new Object[]{context, fontRequest, fontCallback, handler, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        return requestFont(context, fontRequest, i2, z, i, ResourcesCompat.FontCallback.getHandler(handler), new TypefaceCompat.ResourcesCallbackAdapter(fontCallback));
    }

    @Deprecated
    public static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) throws PackageManager.NameNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProviderInfo) ipChange.ipc$dispatch("a3fa2884", new Object[]{packageManager, fontRequest, resources});
        }
        return FontProvider.getProvider(packageManager, fontRequest, resources);
    }

    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9fcd3c50", new Object[]{context, fontInfoArr, cancellationSignal});
        }
        return TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    public static void requestFont(Context context, FontRequest fontRequest, FontRequestCallback fontRequestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630256c0", new Object[]{context, fontRequest, fontRequestCallback, handler});
            return;
        }
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), fontRequest, 0, RequestExecutor.createHandlerExecutor(handler), new CallbackWithHandler(fontRequestCallback));
    }

    @Deprecated
    public static void resetCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9252e7a", new Object[0]);
        } else {
            FontRequestWorker.resetTypefaceCache();
        }
    }

    public static void resetTypefaceCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e469cea3", new Object[0]);
        } else {
            FontRequestWorker.resetTypefaceCache();
        }
    }

    public static Typeface requestFont(Context context, FontRequest fontRequest, int i, boolean z, int i2, Handler handler, FontRequestCallback fontRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("69c422dc", new Object[]{context, fontRequest, new Integer(i), new Boolean(z), new Integer(i2), handler, fontRequestCallback});
        }
        CallbackWithHandler callbackWithHandler = new CallbackWithHandler(fontRequestCallback, handler);
        if (z) {
            return FontRequestWorker.requestFontSync(context, fontRequest, callbackWithHandler, i, i2);
        }
        return FontRequestWorker.requestFontAsync(context, fontRequest, i, null, callbackWithHandler);
    }
}
