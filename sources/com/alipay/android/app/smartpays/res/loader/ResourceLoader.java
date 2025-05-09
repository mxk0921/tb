package com.alipay.android.app.smartpays.res.loader;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.IResourceProvider;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import tb.pg1;
import tb.zk4;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResourceLoader implements IResourceLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IResourceProvider f3501a;

    public ResourceLoader(IResourceProvider iResourceProvider) {
        this.f3501a = iResourceProvider;
    }

    @Override // com.alipay.android.app.smartpays.res.IResourceLoader
    public int getDrawableId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("442f9793", new Object[]{this, str})).intValue();
        }
        return getResourceId(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
    }

    @Override // com.alipay.android.app.smartpays.res.IResourceLoader
    public int getId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eeb42d5", new Object[]{this, str})).intValue();
        }
        return getResourceId(str, "id");
    }

    @Override // com.alipay.android.app.smartpays.res.IResourceLoader
    public int getLayoutId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caae939f", new Object[]{this, str})).intValue();
        }
        return getResourceId(str, "layout");
    }

    @Override // com.alipay.android.app.smartpays.res.IResourceLoader
    public int getResourceId(String str, String str2) {
        IResourceProvider iResourceProvider = this.f3501a;
        int i = -1;
        try {
            String packageName = iResourceProvider.getPackageName();
            try {
                i = ((Integer) Class.forName(packageName + ".R$" + str2).getField(str).get(null)).intValue();
                if (i > 0) {
                    return i;
                }
            } catch (Throwable unused) {
            }
            return iResourceProvider.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return i;
        }
    }

    @Override // com.alipay.android.app.smartpays.res.IResourceLoader
    public int getStringId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f527386", new Object[]{this, str})).intValue();
        }
        return getResourceId(str, "string");
    }

    @Override // com.alipay.android.app.smartpays.res.IResourceLoader
    public Drawable getPaddingDrawable(int i, int i2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d52a2f2", new Object[]{this, new Integer(i), new Integer(i2), context});
        }
        if (context != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            Resources resources = context.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (displayMetrics.density * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
            return new BitmapDrawable(resources, createBitmap);
        }
        throw new IllegalArgumentException("Invalid context");
    }
}
