package com.taobao.uikit.actionbar;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPublicMenuItem implements Cloneable, Comparable<TBPublicMenuItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FROM_THIRD_PARTY = 2;
    public static final int FROM_UIKIT = 1;
    public static final int TYPE_DEFAULT = 4;
    public static final int TYPE_EXTERNAL = 8;
    public static final int TYPE_SHARE = 2;
    public MessageMode mMessageMode;
    public int mId = -1;
    public String mImgTipsUri = null;
    public String mMessage = "";
    public Drawable mIconDrawable = null;
    public String mIconUrl = null;
    public String mUTControlName = null;
    public String mOldControlName = null;
    public String mNavUrl = null;
    public String mTitle = null;
    public int mSource = 2;
    public int mType = 8;
    public String mName = null;
    public boolean mNeedLogin = false;
    public boolean mVisible = true;
    private int mOrder = 0;
    private boolean mMenuNeedToBeClosed = true;
    private WeakReference<TBPublicMenuItemObserver> mItemObserverRef = null;
    public boolean isI18nSupported = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final TBPublicMenuItem mMenuItem = new TBPublicMenuItem();

        static {
            t2o.a(927989833);
        }

        public TBPublicMenuItem build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenuItem) ipChange.ipc$dispatch("30f4280b", new Object[]{this});
            }
            if (!this.mMenuItem.checkValidation()) {
                return null;
            }
            return this.mMenuItem;
        }

        public int getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
            }
            return this.mMenuItem.getId();
        }

        public Builder setI18nSupported(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("645d2c1e", new Object[]{this, new Boolean(z)});
            }
            this.mMenuItem.isI18nSupported = z;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("38de36c5", new Object[]{this, drawable});
            }
            this.mMenuItem.setIconDrawable(drawable);
            return this;
        }

        public Builder setId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c516b7e", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.setId(i);
            return this;
        }

        public Builder setImageTipUri(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d362da7a", new Object[]{this, str});
            }
            this.mMenuItem.mImgTipsUri = str;
            return this;
        }

        public Builder setMenuNeedtoBeClosedAfterItemClicked(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5c6961b3", new Object[]{this, new Boolean(z)});
            }
            this.mMenuItem.setMenuNeedToBeClosed(z);
            return this;
        }

        public Builder setMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5efb2bb5", new Object[]{this, str});
            }
            this.mMenuItem.setMessage(str);
            return this;
        }

        public Builder setMessageMode(MessageMode messageMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fa1b2f10", new Object[]{this, messageMode});
            }
            this.mMenuItem.setMessageMode(messageMode);
            return this;
        }

        public Builder setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1388b27d", new Object[]{this, str});
            }
            this.mMenuItem.mName = str;
            return this;
        }

        public Builder setNavUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b67aa77e", new Object[]{this, str});
            }
            this.mMenuItem.setNavUrl(str);
            return this;
        }

        public Builder setNeedLogin(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("81dba23b", new Object[]{this, new Boolean(z)});
            }
            this.mMenuItem.setNeedLogin(z);
            return this;
        }

        public Builder setOldControlName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fc3d02d3", new Object[]{this, str});
            }
            this.mMenuItem.setOldControlName(str);
            return this;
        }

        public Builder setOrder(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fa712f6f", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.setOrder(i);
            return this;
        }

        public Builder setSource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3170217e", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.mSource = i;
            return this;
        }

        public Builder setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("531f2c46", new Object[]{this, str});
            }
            this.mMenuItem.setTitle(str);
            return this;
        }

        public Builder setType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("52a65ebf", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.mType = i;
            return this;
        }

        public Builder setUTControlName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4dcc9c37", new Object[]{this, str});
            }
            this.mMenuItem.setUTControlName(str);
            return this;
        }

        public Builder setIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ed6cf2eb", new Object[]{this, str});
            }
            this.mMenuItem.setIconUrl(str);
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum MessageMode {
        NONE,
        DOT_ONLY,
        DOT_WITH_NUMBER,
        IMG_TIPS,
        TEXT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MessageMode messageMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/TBPublicMenuItem$MessageMode");
        }

        public static MessageMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageMode) ipChange.ipc$dispatch("e799509", new Object[]{str}) : (MessageMode) Enum.valueOf(MessageMode.class, str);
        }

        public static MessageMode valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessageMode) ipChange.ipc$dispatch("ecab2d84", new Object[]{new Integer(i)});
            }
            MessageMode messageMode = DOT_ONLY;
            if (i == messageMode.ordinal()) {
                return messageMode;
            }
            MessageMode messageMode2 = DOT_WITH_NUMBER;
            if (i == messageMode2.ordinal()) {
                return messageMode2;
            }
            MessageMode messageMode3 = TEXT;
            if (i == messageMode3.ordinal()) {
                return messageMode3;
            }
            MessageMode messageMode4 = IMG_TIPS;
            return i == messageMode4.ordinal() ? messageMode4 : NONE;
        }
    }

    static {
        t2o.a(927989832);
    }

    public boolean checkValidation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d32bac", new Object[]{this})).booleanValue();
        }
        MessageMode messageMode = this.mMessageMode;
        if (messageMode != null && messageMode == MessageMode.DOT_WITH_NUMBER) {
            try {
                Integer.valueOf(this.mMessage);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        if (checkValidation()) {
            return new Builder().setTitle(getTitle()).setMessageMode(getMessageMode()).setUTControlName(getUTControlName()).setNavUrl(getNavUrl()).setIcon(getIconDrawable()).setIcon(getIconUrl()).setMessage(getMessage()).setId(getId()).setName(getName()).setSource(getSource()).setType(getType()).setMenuNeedtoBeClosedAfterItemClicked(isMenuNeedToBeClosed()).setImageTipUri(getImageTipUri()).setI18nSupported(getIsI18nSupported()).build();
        }
        return null;
    }

    public Drawable getIconDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("d7ea3c86", new Object[]{this});
        }
        return this.mIconDrawable;
    }

    public String getIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.mIconUrl;
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.mId;
    }

    public String getImageTipUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2505c1e3", new Object[]{this});
        }
        return this.mImgTipsUri;
    }

    public boolean getIsI18nSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f652b17b", new Object[]{this})).booleanValue();
        }
        return this.isI18nSupported;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.mMessage;
    }

    public MessageMode getMessageMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageMode) ipChange.ipc$dispatch("6130aeb", new Object[]{this});
        }
        return this.mMessageMode;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    public String getNavUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7553bf7", new Object[]{this});
        }
        return this.mNavUrl;
    }

    public String getOldControlName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27582", new Object[]{this});
        }
        return this.mOldControlName;
    }

    public int getOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8042612", new Object[]{this})).intValue();
        }
        return this.mOrder;
    }

    public int getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abef1f0b", new Object[]{this})).intValue();
        }
        return this.mSource;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.mTitle;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public String getUTControlName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b15e2306", new Object[]{this});
        }
        return this.mUTControlName;
    }

    public boolean isAddByUikit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede8a91f", new Object[]{this})).booleanValue();
        }
        if (this.mSource == 1) {
            return true;
        }
        return false;
    }

    public boolean isMenuNeedToBeClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3538e74", new Object[]{this})).booleanValue();
        }
        return this.mMenuNeedToBeClosed;
    }

    public boolean isNeedLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4272ce74", new Object[]{this})).booleanValue();
        }
        return this.mNeedLogin;
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        return this.mVisible;
    }

    public void resetDataChangeObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a2105a6", new Object[]{this});
            return;
        }
        WeakReference<TBPublicMenuItemObserver> weakReference = this.mItemObserverRef;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public void setDataChangeObserver(TBPublicMenuItemObserver tBPublicMenuItemObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b031d7", new Object[]{this, tBPublicMenuItemObserver});
        } else {
            this.mItemObserverRef = new WeakReference<>(tBPublicMenuItemObserver);
        }
    }

    public void setIconDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a968e4", new Object[]{this, drawable});
        } else {
            this.mIconDrawable = drawable;
        }
    }

    public void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.mIconUrl = str;
        }
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.mId = i;
        }
    }

    public void setImageTipUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9369a95b", new Object[]{this, str});
        } else {
            this.mImgTipsUri = str;
        }
    }

    public void setIsI18nSupported(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e575f49", new Object[]{this, new Boolean(z)});
        } else {
            this.isI18nSupported = z;
        }
    }

    public void setMenuNeedToBeClosed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ffa42c", new Object[]{this, new Boolean(z)});
        } else {
            this.mMenuNeedToBeClosed = z;
        }
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.mMessage = str;
        }
    }

    public void setMessageMode(MessageMode messageMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef17cf1", new Object[]{this, messageMode});
        } else {
            this.mMessageMode = messageMode;
        }
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.mName = str;
        }
    }

    public void setNavUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fc305f", new Object[]{this, str});
        } else {
            this.mNavUrl = str;
        }
    }

    public void setNeedLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca5f9c", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedLogin = z;
        }
    }

    public void setOldControlName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11185c34", new Object[]{this, str});
        } else {
            this.mOldControlName = str;
        }
    }

    public void setOrder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a55ed0", new Object[]{this, new Integer(i)});
        } else {
            this.mOrder = i;
        }
    }

    public void setSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685aaa5f", new Object[]{this, new Integer(i)});
        } else {
            this.mSource = i;
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.mTitle = str;
        }
    }

    public void setUTControlName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af061f98", new Object[]{this, str});
        } else {
            this.mUTControlName = str;
        }
    }

    public void setVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
        } else {
            this.mVisible = z;
        }
    }

    public void update() {
        TBPublicMenuItemObserver tBPublicMenuItemObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        WeakReference<TBPublicMenuItemObserver> weakReference = this.mItemObserverRef;
        if (weakReference != null && (tBPublicMenuItemObserver = weakReference.get()) != null) {
            tBPublicMenuItemObserver.onItemDataChanged(this);
        }
    }

    public int compareTo(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8f68df2", new Object[]{this, tBPublicMenuItem})).intValue() : Integer.compare(getOrder(), tBPublicMenuItem.getOrder());
    }
}
