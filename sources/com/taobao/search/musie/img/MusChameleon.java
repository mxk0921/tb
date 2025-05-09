package com.taobao.search.musie.img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.colortreatment.b;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.musie.img.MusChameleon;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.fxh;
import tb.hpc;
import tb.nx7;
import tb.t2o;
import tb.uvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusChameleon extends UINode implements hpc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_COLOR_PICK_AREA = "colorPickArea";
    private static final String ATTR_IMG_HEIGHT = "imgHeight";
    private static final String ATTR_IMG_WIDTH = "imgWidth";
    private static final String ATTR_SRC = "src";
    public static final a Companion = new a(null);
    private int mBackgroundColor;
    private boolean needRefresh;
    private Object tag;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792730);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792729);
        t2o.a(982516044);
    }

    public MusChameleon(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MusChameleon musChameleon, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -370110026) {
            super.collectBatchTasks((List) objArr[0]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -136526582) {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/img/MusChameleon");
        }
    }

    private final void loadImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83217ce", new Object[]{this, str});
        } else {
            uvh.f().e().b(getInstance().getUIContext(), str, this, MUSImageQuality.AUTO);
        }
    }

    @Override // tb.hpc.a
    public void c(Drawable drawable) {
        Bitmap extractImagePart;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
            return;
        }
        String str = (String) getAttribute(ATTR_COLOR_PICK_AREA);
        if (str != null && (extractImagePart = extractImagePart(drawable, str)) != null) {
            b.b(extractImagePart).a(new b.AbstractC0465b() { // from class: tb.xfz
                @Override // com.taobao.android.megadesign.colortreatment.b.AbstractC0465b
                public final void a(b bVar) {
                    MusChameleon.setImage$lambda$3(MusChameleon.this, bVar);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void collectBatchTasks(List<Runnable> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        ckf.g(list, "runnableList");
        super.collectBatchTasks(list);
        if (this.needRefresh && (str = (String) getAttribute("src")) != null) {
            loadImg(str);
        }
    }

    @Override // tb.hvu
    public Object createMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2275846d", new Object[]{this, context});
        }
        return new View(context);
    }

    @Override // tb.hpc.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
        }
    }

    @Override // tb.hpc.a
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.tag = obj;
        }
    }

    @Override // tb.hpc.a
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        Integer num = (Integer) getAttribute(ATTR_IMG_HEIGHT);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // tb.hpc.a
    public Object getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.tag;
    }

    @Override // tb.hpc.a
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        Integer num = (Integer) getAttribute(ATTR_IMG_WIDTH);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        String str = (String) getAttribute("src");
        if (str != null) {
            loadImg(str);
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        String str = (String) getAttribute("src");
        if (str != null) {
            uvh.f().e().a(str, this);
            ((View) getMountContent()).setBackground(null);
        }
    }

    @MUSNodeProp(name = ATTR_COLOR_PICK_AREA, refresh = true)
    public final void refreshColorPickArea(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c813c7", new Object[]{this, str});
            return;
        }
        ckf.g(str, "area");
        this.needRefresh = true;
    }

    @MUSNodeProp(name = ATTR_IMG_HEIGHT, refresh = true)
    public final void refreshImgHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1b6780", new Object[]{this, str});
            return;
        }
        ckf.g(str, ATTR_IMG_HEIGHT);
        this.needRefresh = true;
    }

    @MUSNodeProp(name = ATTR_IMG_WIDTH, refresh = true)
    public final void refreshImgWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da29abcf", new Object[]{this, str});
            return;
        }
        ckf.g(str, ATTR_IMG_WIDTH);
        this.needRefresh = true;
    }

    @MUSNodeProp(name = ATTR_COLOR_PICK_AREA)
    public final void setColorPickArea(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87704e0", new Object[]{this, str});
            return;
        }
        ckf.g(str, "area");
        setAttribute(ATTR_COLOR_PICK_AREA, str);
    }

    @MUSNodeProp(name = ATTR_IMG_HEIGHT)
    public final void setImgHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf98cd19", new Object[]{this, str});
            return;
        }
        ckf.g(str, ATTR_IMG_HEIGHT);
        setAttribute(ATTR_IMG_HEIGHT, Integer.valueOf((int) fxh.e(str)));
    }

    @MUSNodeProp(name = ATTR_IMG_WIDTH)
    public final void setImgWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740caf16", new Object[]{this, str});
            return;
        }
        ckf.g(str, ATTR_IMG_WIDTH);
        setAttribute(ATTR_IMG_WIDTH, Integer.valueOf((int) fxh.e(str)));
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        ckf.g(str, "src");
        setAttribute("src", str);
    }

    private final Bitmap extractImagePart(Drawable drawable, String str) {
        BitmapDrawable bitmapDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("310adc40", new Object[]{this, drawable, str});
        }
        if (drawable instanceof nx7) {
            bitmapDrawable = ((nx7) drawable).d();
        } else {
            bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        }
        if (bitmapDrawable == null) {
            return null;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        switch (str.hashCode()) {
            case -1383228885:
                if (!str.equals("bottom")) {
                    return null;
                }
                return Bitmap.createBitmap(bitmap, 0, (int) (bitmap.getHeight() * 0.9d), bitmap.getWidth(), (int) (bitmap.getHeight() * 0.1d));
            case 115029:
                if (!str.equals("top")) {
                    return null;
                }
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), (int) (bitmap.getHeight() * 0.1d));
            case 3317767:
                if (!str.equals("left")) {
                    return null;
                }
                return Bitmap.createBitmap(bitmap, 0, 0, (int) (bitmap.getWidth() * 0.1d), bitmap.getHeight());
            case 108511772:
                if (!str.equals("right")) {
                    return null;
                }
                return Bitmap.createBitmap(bitmap, (int) (bitmap.getWidth() * 0.9d), 0, (int) (bitmap.getWidth() * 0.1d), bitmap.getHeight());
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setImage$lambda$3(MusChameleon musChameleon, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4836afd0", new Object[]{musChameleon, bVar});
            return;
        }
        ckf.g(musChameleon, "this$0");
        if (bVar != null) {
            musChameleon.mBackgroundColor = bVar.c(0);
            ((View) musChameleon.getMountContent()).setBackgroundColor(musChameleon.mBackgroundColor);
        }
    }

    @MUSNodeProp(name = "src", refresh = true)
    public final void refreshSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae43deda", new Object[]{this, str});
            return;
        }
        ckf.g(str, "src");
        this.needRefresh = true;
    }
}
