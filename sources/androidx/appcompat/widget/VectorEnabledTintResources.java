package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VectorEnabledTintResources extends ResourcesWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled;
    private final WeakReference<Context> mContextRef;

    public VectorEnabledTintResources(Context context, Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    public static /* synthetic */ Object ipc$super(VectorEnabledTintResources vectorEnabledTintResources, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2111110055:
                return super.getStringArray(((Number) objArr[0]).intValue());
            case -2083320178:
                return super.getLayout(((Number) objArr[0]).intValue());
            case -1935838630:
                return super.getColorStateList(((Number) objArr[0]).intValue());
            case -1501686619:
                return super.getQuantityText(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case -1483807804:
                return super.getString(((Number) objArr[0]).intValue(), (Object[]) objArr[1]);
            case -1392410159:
                super.parseBundleExtras((XmlResourceParser) objArr[0], (Bundle) objArr[1]);
                return null;
            case -1349695011:
                return super.getText(((Number) objArr[0]).intValue(), (CharSequence) objArr[1]);
            case -1289303305:
                return new Integer(super.getIdentifier((String) objArr[0], (String) objArr[1], (String) objArr[2]));
            case -1159495904:
                return super.getAnimation(((Number) objArr[0]).intValue());
            case -1090998665:
                super.updateConfiguration((Configuration) objArr[0], (DisplayMetrics) objArr[1]);
                return null;
            case -978891697:
                return super.getTextArray(((Number) objArr[0]).intValue());
            case -695018968:
                return super.getIntArray(((Number) objArr[0]).intValue());
            case -576565604:
                return new Float(super.getDimension(((Number) objArr[0]).intValue()));
            case -468787923:
                return super.getXml(((Number) objArr[0]).intValue());
            case -436736815:
                return super.getResourcePackageName(((Number) objArr[0]).intValue());
            case -329272601:
                return super.getConfiguration();
            case -207995225:
                return super.getQuantityString(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case -147011149:
                return super.getResourceName(((Number) objArr[0]).intValue());
            case -41119543:
                return super.obtainTypedArray(((Number) objArr[0]).intValue());
            case -2121164:
                return new Float(super.getFraction(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            case 18746696:
                super.getValue(((Number) objArr[0]).intValue(), (TypedValue) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 29277574:
                return super.getDrawable(((Number) objArr[0]).intValue(), (Resources.Theme) objArr[1]);
            case 35169555:
                super.getValue((String) objArr[0], (TypedValue) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 41588160:
                return super.openRawResource(((Number) objArr[0]).intValue(), (TypedValue) objArr[1]);
            case 69782135:
                return super.getMovie(((Number) objArr[0]).intValue());
            case 114450360:
                return super.getDrawableForDensity(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Resources.Theme) objArr[2]);
            case 235474573:
                return super.getResourceTypeName(((Number) objArr[0]).intValue());
            case 323816587:
                return super.getString(((Number) objArr[0]).intValue());
            case 540540590:
                return new Boolean(super.getBoolean(((Number) objArr[0]).intValue()));
            case 586000199:
                return new Integer(super.getInteger(((Number) objArr[0]).intValue()));
            case 832519784:
                super.getValueForDensity(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (TypedValue) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 867427368:
                return super.getQuantityString(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Object[]) objArr[2]);
            case 918399229:
                return super.getResourceEntryName(((Number) objArr[0]).intValue());
            case 929867136:
                return super.getDrawableForDensity(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case 944385474:
                return new Integer(super.getColor(((Number) objArr[0]).intValue()));
            case 1065143297:
                return super.getText(((Number) objArr[0]).intValue());
            case 1150550317:
                return super.openRawResourceFd(((Number) objArr[0]).intValue());
            case 1223062232:
                return new Integer(super.getDimensionPixelSize(((Number) objArr[0]).intValue()));
            case 1342203443:
                return super.openRawResource(((Number) objArr[0]).intValue());
            case 1736557528:
                return super.obtainAttributes((AttributeSet) objArr[0], (int[]) objArr[1]);
            case 1866983174:
                return new Integer(super.getDimensionPixelOffset(((Number) objArr[0]).intValue()));
            case 2001815890:
                super.parseBundleExtra((String) objArr[0], (AttributeSet) objArr[1], (Bundle) objArr[2]);
                return null;
            case 2147328961:
                return super.getDisplayMetrics();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/VectorEnabledTintResources");
        }
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8935fb80", new Object[0])).booleanValue();
        }
        return sCompatVectorFromResourcesEnabled;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4c1aa0", new Object[]{new Boolean(z)});
        } else {
            sCompatVectorFromResourcesEnabled = z;
        }
    }

    public static boolean shouldBeUsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c0d753e", new Object[0])).booleanValue();
        }
        isCompatVectorFromResourcesEnabled();
        return false;
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return super.getAnimation(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) throws Resources.NotFoundException {
        return super.getBoolean(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) throws Resources.NotFoundException {
        return super.getColor(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return super.getColorStateList(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) throws Resources.NotFoundException {
        return super.getDimension(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i, theme);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) throws Resources.NotFoundException {
        return super.getIntArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) throws Resources.NotFoundException {
        return super.getInteger(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return super.getLayout(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i) throws Resources.NotFoundException {
        return super.getMovie(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityText(i, i2);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) throws Resources.NotFoundException {
        return super.getResourceEntryName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i) throws Resources.NotFoundException {
        return super.getResourceName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) throws Resources.NotFoundException {
        return super.getResourcePackageName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) throws Resources.NotFoundException {
        return super.getResourceTypeName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i) throws Resources.NotFoundException {
        return super.getString(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i) throws Resources.NotFoundException {
        return super.getStringArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i) throws Resources.NotFoundException {
        return super.getText(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return super.getTextArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(i, typedValue, z);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return super.getXml(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return super.obtainTypedArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) throws Resources.NotFoundException {
        return super.openRawResource(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return super.openRawResourceFd(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f226a6f2", new Object[]{this, new Integer(i)});
        }
        Context context = this.mContextRef.get();
        if (context != null) {
            return ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i);
        }
        return getDrawableCanonical(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i, objArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i, typedValue);
    }
}
