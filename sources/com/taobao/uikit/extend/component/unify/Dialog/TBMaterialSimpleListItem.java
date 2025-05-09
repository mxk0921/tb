package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.utils.ResourceUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBMaterialSimpleListItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Builder mBuilder;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mBackgroundColor = Color.parseColor("#BCBCBC");
        public CharSequence mContent;
        private final Context mContext;
        public Drawable mIcon;
        public int mIconPadding;

        static {
            t2o.a(932184165);
        }

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder backgroundColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3b48c915", new Object[]{this, new Integer(i)});
            }
            this.mBackgroundColor = i;
            return this;
        }

        public Builder backgroundColorAttr(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2ad08a24", new Object[]{this, new Integer(i)});
            }
            return backgroundColor(ResourceUtils.resolveColor(this.mContext, i));
        }

        public Builder backgroundColorRes(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("60d3801f", new Object[]{this, new Integer(i)});
            }
            return backgroundColor(ResourceUtils.getColor(this.mContext, i));
        }

        public TBMaterialSimpleListItem build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBMaterialSimpleListItem) ipChange.ipc$dispatch("68a4665a", new Object[]{this});
            }
            return new TBMaterialSimpleListItem(this);
        }

        public Builder content(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a7727a92", new Object[]{this, charSequence});
            }
            this.mContent = charSequence;
            return this;
        }

        public Builder icon(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3ec00112", new Object[]{this, drawable});
            }
            this.mIcon = drawable;
            return this;
        }

        public Builder iconPadding(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7b5d4a72", new Object[]{this, new Integer(i)});
            }
            this.mIconPadding = i;
            return this;
        }

        public Builder iconPaddingDp(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cd033b46", new Object[]{this, new Integer(i)});
            }
            this.mIconPadding = (int) TypedValue.applyDimension(1, i, this.mContext.getResources().getDisplayMetrics());
            return this;
        }

        public Builder iconPaddingRes(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("730da5a2", new Object[]{this, new Integer(i)});
            }
            return iconPadding(this.mContext.getResources().getDimensionPixelSize(i));
        }

        public Builder content(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("94d859f1", new Object[]{this, new Integer(i)}) : content(this.mContext.getString(i));
        }

        public Builder icon(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("f7b351f1", new Object[]{this, new Integer(i)}) : icon(ContextCompat.getDrawable(this.mContext, i));
        }
    }

    static {
        t2o.a(932184163);
    }

    public int getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.mBuilder.mBackgroundColor;
    }

    public CharSequence getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a86bf930", new Object[]{this});
        }
        return this.mBuilder.mContent;
    }

    public Drawable getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
        }
        return this.mBuilder.mIcon;
    }

    public int getIconPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db2b379c", new Object[]{this})).intValue();
        }
        return this.mBuilder.mIconPadding;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (getContent() != null) {
            return getContent().toString();
        }
        return "(no content)";
    }

    private TBMaterialSimpleListItem(Builder builder) {
        this.mBuilder = builder;
    }
}
