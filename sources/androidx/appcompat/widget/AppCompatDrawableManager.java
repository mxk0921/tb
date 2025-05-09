package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AppCompatDrawableManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public static /* synthetic */ PorterDuff.Mode access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("a77d76ca", new Object[0]);
        }
        return DEFAULT_MODE;
    }

    public static synchronized AppCompatDrawableManager get() {
        synchronized (AppCompatDrawableManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppCompatDrawableManager) ipChange.ipc$dispatch("99727dc3", new Object[0]);
            }
            if (INSTANCE == null) {
                preload();
            }
            return INSTANCE;
        }
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        synchronized (AppCompatDrawableManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuffColorFilter) ipChange.ipc$dispatch("bebc96cc", new Object[]{new Integer(i), mode});
            }
            return ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
        }
    }

    public static synchronized void preload() {
        synchronized (AppCompatDrawableManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b1c610", new Object[0]);
                return;
            }
            if (INSTANCE == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                INSTANCE = appCompatDrawableManager;
                appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
                INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                    private final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                    private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                    private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                    private final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                    private final int[] TINT_CHECKABLE_BUTTON_LIST = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                    private boolean arrayContains(int[] iArr, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("44f5813a", new Object[]{this, iArr, new Integer(i)})).booleanValue();
                        }
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    private ColorStateList createButtonColorStateList(Context context, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ColorStateList) ipChange2.ipc$dispatch("a51141f8", new Object[]{this, context, new Integer(i)});
                        }
                        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
                        return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i), ColorUtils.compositeColors(themeAttrColor, i), i});
                    }

                    private ColorStateList createColoredButtonColorStateList(Context context) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ColorStateList) ipChange2.ipc$dispatch("fa069f17", new Object[]{this, context});
                        }
                        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
                    }

                    private ColorStateList createDefaultButtonColorStateList(Context context) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ColorStateList) ipChange2.ipc$dispatch("6b639896", new Object[]{this, context});
                        }
                        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
                    }

                    private void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1bc7ab69", new Object[]{this, drawable, new Integer(i), mode});
                            return;
                        }
                        Drawable mutate = drawable.mutate();
                        if (mode == null) {
                            mode = AppCompatDrawableManager.access$000();
                        }
                        mutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i, mode));
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public ColorStateList getTintListForDrawableRes(Context context, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ColorStateList) ipChange2.ipc$dispatch("7c0d8b2a", new Object[]{this, context, new Integer(i)});
                        }
                        if (i == R.drawable.abc_edit_text_material) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
                        }
                        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
                        }
                        if (i == R.drawable.abc_switch_thumb_material) {
                            return createSwitchThumbColorStateList(context);
                        }
                        if (i == R.drawable.abc_btn_default_mtrl_shape) {
                            return createDefaultButtonColorStateList(context);
                        }
                        if (i == R.drawable.abc_btn_borderless_material) {
                            return createBorderlessButtonColorStateList(context);
                        }
                        if (i == R.drawable.abc_btn_colored_material) {
                            return createColoredButtonColorStateList(context);
                        }
                        if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
                        }
                        if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i)) {
                            return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                        }
                        if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i)) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                        }
                        if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i)) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                        }
                        if (i == R.drawable.abc_seekbar_thumb_material) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public PorterDuff.Mode getTintModeForDrawableRes(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (PorterDuff.Mode) ipChange2.ipc$dispatch("49676632", new Object[]{this, new Integer(i)});
                        }
                        if (i == R.drawable.abc_switch_thumb_material) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[RETURN] */
                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean tintDrawableUsingColorFilter(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            r0 = 1
                            r1 = 0
                            com.android.alibaba.ip.runtime.IpChange r2 = androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.$ipChange
                            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                            if (r3 == 0) goto L_0x0027
                            java.lang.Integer r3 = new java.lang.Integer
                            r3.<init>(r8)
                            r8 = 4
                            java.lang.Object[] r8 = new java.lang.Object[r8]
                            r8[r1] = r6
                            r8[r0] = r7
                            r7 = 2
                            r8[r7] = r3
                            r7 = 3
                            r8[r7] = r9
                            java.lang.String r7 = "9de6c89a"
                            java.lang.Object r7 = r2.ipc$dispatch(r7, r8)
                            java.lang.Boolean r7 = (java.lang.Boolean) r7
                            boolean r7 = r7.booleanValue()
                            return r7
                        L_0x0027:
                            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                            int[] r3 = r6.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                            boolean r3 = r6.arrayContains(r3, r8)
                            r4 = -1
                            if (r3 == 0) goto L_0x003a
                            int r8 = com.taobao.taobao.R.attr.colorControlNormal
                        L_0x0036:
                            r3 = r2
                        L_0x0037:
                            r2 = -1
                            r5 = 1
                            goto L_0x0075
                        L_0x003a:
                            int[] r3 = r6.COLORFILTER_COLOR_CONTROL_ACTIVATED
                            boolean r3 = r6.arrayContains(r3, r8)
                            if (r3 == 0) goto L_0x0045
                            int r8 = com.taobao.taobao.R.attr.colorControlActivated
                            goto L_0x0036
                        L_0x0045:
                            int[] r3 = r6.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                            boolean r3 = r6.arrayContains(r3, r8)
                            r5 = 16842801(0x1010031, float:2.3693695E-38)
                            if (r3 == 0) goto L_0x0057
                            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
                        L_0x0052:
                            r3 = r2
                            r8 = 16842801(0x1010031, float:2.3693695E-38)
                            goto L_0x0037
                        L_0x0057:
                            int r3 = com.taobao.taobao.R.drawable.abc_list_divider_mtrl_alpha
                            if (r8 != r3) goto L_0x006c
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            r3 = 16842800(0x1010030, float:2.3693693E-38)
                            r3 = r2
                            r5 = 1
                            r2 = r8
                            r8 = 16842800(0x1010030, float:2.3693693E-38)
                            goto L_0x0075
                        L_0x006c:
                            int r3 = com.taobao.taobao.R.drawable.abc_dialog_material_background
                            if (r8 != r3) goto L_0x0071
                            goto L_0x0052
                        L_0x0071:
                            r3 = r2
                            r8 = 0
                            r2 = -1
                            r5 = 0
                        L_0x0075:
                            if (r5 == 0) goto L_0x008c
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                            int r7 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r7, r8)
                            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r7, r3)
                            r9.setColorFilter(r7)
                            if (r2 == r4) goto L_0x008b
                            r9.setAlpha(r2)
                        L_0x008b:
                            return r0
                        L_0x008c:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    private ColorStateList createBorderlessButtonColorStateList(Context context) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ColorStateList) ipChange2.ipc$dispatch("f2f6dad2", new Object[]{this, context});
                        }
                        return createButtonColorStateList(context, 0);
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public boolean tintDrawable(Context context, int i, Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("e18fea3", new Object[]{this, context, new Integer(i), drawable})).booleanValue();
                        }
                        if (i == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                            int i2 = R.attr.colorControlNormal;
                            setPorterDuffColorFilter(findDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i2), AppCompatDrawableManager.access$000());
                            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, i2), AppCompatDrawableManager.access$000());
                            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.access$000());
                            return true;
                        } else if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
                            return false;
                        } else {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.access$000());
                            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                            int i3 = R.attr.colorControlActivated;
                            setPorterDuffColorFilter(findDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i3), AppCompatDrawableManager.access$000());
                            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, i3), AppCompatDrawableManager.access$000());
                            return true;
                        }
                    }

                    private ColorStateList createSwitchThumbColorStateList(Context context) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ColorStateList) ipChange2.ipc$dispatch("d6d5a185", new Object[]{this, context});
                        }
                        int[][] iArr = new int[3];
                        int[] iArr2 = new int[3];
                        int i = R.attr.colorSwitchThumbNormal;
                        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i);
                        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i);
                            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                            iArr2[2] = ThemeUtils.getThemeAttrColor(context, i);
                        } else {
                            int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                            iArr[0] = iArr3;
                            iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                            iArr2[2] = themeAttrColorStateList.getDefaultColor();
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Drawable) ipChange2.ipc$dispatch("d8a87037", new Object[]{this, resourceManagerInternal, context, new Integer(i)});
                        }
                        if (i == R.drawable.abc_cab_background_top_material) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                        }
                        if (i == R.drawable.abc_ratingbar_material) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_big);
                        }
                        if (i == R.drawable.abc_ratingbar_indicator_material) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_medium);
                        }
                        if (i == R.drawable.abc_ratingbar_small_material) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_small);
                        }
                        return null;
                    }

                    private LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (LayerDrawable) ipChange2.ipc$dispatch("d42efeb2", new Object[]{this, resourceManagerInternal, context, new Integer(i)});
                        }
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                        Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
                        Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
                        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable2 = (BitmapDrawable) drawable;
                            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
                        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) drawable2;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }
                });
            }
        }
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbabc69f", new Object[]{drawable, tintInfo, iArr});
        } else {
            ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
        }
    }

    public synchronized Drawable getDrawable(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e90e44e4", new Object[]{this, context, new Integer(i)});
        }
        return this.mResourceManager.getDrawable(context, i);
    }

    public synchronized ColorStateList getTintList(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("2129e883", new Object[]{this, context, new Integer(i)});
        }
        return this.mResourceManager.getTintList(context, i);
    }

    public synchronized void onConfigurationChanged(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8c94e4", new Object[]{this, context});
        } else {
            this.mResourceManager.onConfigurationChanged(context);
        }
    }

    public synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("3433f629", new Object[]{this, context, vectorEnabledTintResources, new Integer(i)});
        }
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i);
    }

    public boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9de6c89a", new Object[]{this, context, new Integer(i), drawable})).booleanValue();
        }
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i, drawable);
    }

    public synchronized Drawable getDrawable(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e05e307c", new Object[]{this, context, new Integer(i), new Boolean(z)});
        }
        return this.mResourceManager.getDrawable(context, i, z);
    }
}
