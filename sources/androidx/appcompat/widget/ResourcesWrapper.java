package androidx.appcompat.widget;

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
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResourcesWrapper extends Resources {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Resources mResources;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    public static /* synthetic */ Object ipc$super(ResourcesWrapper resourcesWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1090998665) {
            super.updateConfiguration((Configuration) objArr[0], (DisplayMetrics) objArr[1]);
            return null;
        } else if (hashCode == -232347918) {
            return super.getDrawable(((Number) objArr[0]).intValue());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/widget/ResourcesWrapper");
        }
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("bae37f20", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2037feae", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mResources.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("384a2dc2", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mResources.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("8c9d725a", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration) ipChange.ipc$dispatch("ec5fb2e7", new Object[]{this});
        }
        return this.mResources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dda24e9c", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.mResources.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f47e706", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mResources.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48e672d8", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mResources.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("7ffda3c1", new Object[]{this});
        }
        return this.mResources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("f226a6f2", new Object[]{this, new Integer(i)}) : this.mResources.getDrawable(i);
    }

    public final Drawable getDrawableCanonical(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("8939ea1e", new Object[]{this, new Integer(i)});
        }
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("376ca580", new Object[]{this, new Integer(i), new Integer(i2)}) : ResourcesCompat.getDrawableForDensity(this.mResources, i, i2, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffdfa234", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).floatValue();
        }
        return this.mResources.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b326caf7", new Object[]{this, str, str2, str3})).intValue();
        }
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("d692da28", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22eda747", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mResources.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("83d30e8e", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Movie) ipChange.ipc$dispatch("428ca77", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33b3e428", new Object[]{this, new Integer(i), new Integer(i2), objArr}) : this.mResources.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a67e14a5", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mResources.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36bda8fd", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f73cc9b3", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5f7ecd1", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e090e8d", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)}) : this.mResources.getString(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("822b0459", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("3f7ccc01", new Object[]{this, new Integer(i)}) : this.mResources.getText(i);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence[]) ipChange.ipc$dispatch("c5a74c4f", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e0d48", new Object[]{this, new Integer(i), typedValue, new Boolean(z)});
        } else {
            this.mResources.getValue(i, typedValue, z);
        }
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319f3e68", new Object[]{this, new Integer(i), new Integer(i2), typedValue, new Boolean(z)});
        } else {
            this.mResources.getValueForDensity(i, i2, typedValue, z);
        }
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("e40edd2d", new Object[]{this, new Integer(i)});
        }
        return this.mResources.getXml(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedArray) ipChange.ipc$dispatch("6781c3d8", new Object[]{this, attributeSet, iArr});
        }
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedArray) ipChange.ipc$dispatch("fd8c90c9", new Object[]{this, new Integer(i)});
        }
        return this.mResources.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("50006633", new Object[]{this, new Integer(i)}) : this.mResources.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("4494012d", new Object[]{this, new Integer(i)});
        }
        return this.mResources.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77514952", new Object[]{this, str, attributeSet, bundle});
        } else {
            this.mResources.parseBundleExtra(str, attributeSet, bundle);
        }
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0181d1", new Object[]{this, xmlResourceParser, bundle});
        } else {
            this.mResources.parseBundleExtras(xmlResourceParser, bundle);
        }
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef8ae77", new Object[]{this, configuration, displayMetrics});
            return;
        }
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("1bebd86", new Object[]{this, new Integer(i), theme}) : ResourcesCompat.getDrawable(this.mResources, i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("6d25fb8", new Object[]{this, new Integer(i), new Integer(i2), theme}) : ResourcesCompat.getDrawableForDensity(this.mResources, i, i2, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f39a3ea7", new Object[]{this, new Integer(i), new Integer(i2)}) : this.mResources.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a78ee3c4", new Object[]{this, new Integer(i), objArr}) : this.mResources.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("af8d49dd", new Object[]{this, new Integer(i), charSequence}) : this.mResources.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218a513", new Object[]{this, str, typedValue, new Boolean(z)});
        } else {
            this.mResources.getValue(str, typedValue, z);
        }
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("27a95c0", new Object[]{this, new Integer(i), typedValue}) : this.mResources.openRawResource(i, typedValue);
    }
}
