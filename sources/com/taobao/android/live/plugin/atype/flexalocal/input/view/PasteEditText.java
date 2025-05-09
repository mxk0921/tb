package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.giv;
import tb.gq0;
import tb.hw0;
import tb.o34;
import tb.o3s;
import tb.t2o;
import tb.uvd;
import tb.ux9;
import tb.v2s;
import tb.xmd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PasteEditText extends EditText {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MIN_PASTE_LENGTH = 10;
    private String mClipText;
    private ITaoLiveKtEmojiManager mEmojiManager;
    private int mEnd;
    public ux9 mFrameContext;
    private int mIconHeight;
    private HashMap<String, StickerConfig> mKeyMatchMap;
    private List<d> mMatchList;
    private String mRecentlyPasteText;
    public List<SpannableString> mSpannableContent;
    private int mStart;
    private boolean mbPaste = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f8564a;
        public final /* synthetic */ List b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public a(d dVar, List list, String str, int i) {
            this.f8564a = dVar;
            this.b = list;
            this.c = str;
            this.d = i;
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                return;
            }
            this.b.add(new SpannableString(this.f8564a.c));
            PasteEditText.access$100(PasteEditText.this, this.c, this.b, this.d + 1);
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
            bitmapDrawable.setBounds(0, 0, (PasteEditText.access$000(PasteEditText.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), PasteEditText.access$000(PasteEditText.this));
            SpannableString spannableString = new SpannableString(this.f8564a.c);
            spannableString.setSpan(new o34(bitmapDrawable), 0, this.f8564a.c.length(), 17);
            this.b.add(spannableString);
            PasteEditText.access$100(PasteEditText.this, this.c, this.b, this.d + 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ActionMode.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(PasteEditText pasteEditText) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb43f5b1", new Object[]{this, actionMode, menuItem})).booleanValue();
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e072c179", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a57b0823", new Object[]{this, actionMode});
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cae505a6", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            } else if (PasteEditText.access$300(PasteEditText.this)) {
                PasteEditText.access$302(PasteEditText.this, false);
                editable.delete(PasteEditText.access$400(PasteEditText.this), PasteEditText.access$500(PasteEditText.this));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            int i4 = i3 + i;
            if (charSequence.subSequence(i, i4).toString().equals(PasteEditText.access$200(PasteEditText.this))) {
                PasteEditText.access$302(PasteEditText.this, true);
                PasteEditText.access$402(PasteEditText.this, i);
                PasteEditText.access$502(PasteEditText.this, i4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f8566a;
        public int b;
        public String c;
        public String d;

        static {
            t2o.a(295699448);
        }
    }

    static {
        t2o.a(295699444);
    }

    public PasteEditText(Context context) {
        super(context);
    }

    public static /* synthetic */ int access$000(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce3027e8", new Object[]{pasteEditText})).intValue();
        }
        return pasteEditText.mIconHeight;
    }

    public static /* synthetic */ void access$100(PasteEditText pasteEditText, String str, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470f75f2", new Object[]{pasteEditText, str, list, new Integer(i)});
        } else {
            pasteEditText.generateStickerByIndex(str, list, i);
        }
    }

    public static /* synthetic */ String access$200(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8878ad89", new Object[]{pasteEditText});
        }
        return pasteEditText.mClipText;
    }

    public static /* synthetic */ boolean access$300(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f9c29fc", new Object[]{pasteEditText})).booleanValue();
        }
        return pasteEditText.mbPaste;
    }

    public static /* synthetic */ boolean access$302(PasteEditText pasteEditText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd0939e", new Object[]{pasteEditText, new Boolean(z)})).booleanValue();
        }
        pasteEditText.mbPaste = z;
        return z;
    }

    public static /* synthetic */ int access$400(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50157fec", new Object[]{pasteEditText})).intValue();
        }
        return pasteEditText.mStart;
    }

    public static /* synthetic */ int access$402(PasteEditText pasteEditText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e81bddb", new Object[]{pasteEditText, new Integer(i)})).intValue();
        }
        pasteEditText.mStart = i;
        return i;
    }

    public static /* synthetic */ int access$500(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("308ed5ed", new Object[]{pasteEditText})).intValue();
        }
        return pasteEditText.mEnd;
    }

    public static /* synthetic */ int access$502(PasteEditText pasteEditText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d3327fa", new Object[]{pasteEditText, new Integer(i)})).intValue();
        }
        pasteEditText.mEnd = i;
        return i;
    }

    private void generateStickerByIndex(String str, List<SpannableString> list, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1b72ce", new Object[]{this, str, list, new Integer(i)});
        } else if (i >= this.mMatchList.size()) {
            int i3 = i - 1;
            if (this.mMatchList.get(i3).b < str.length()) {
                list.add(new SpannableString(str.substring(this.mMatchList.get(i3).b)));
            }
        } else {
            d dVar = this.mMatchList.get(i);
            if (dVar.f8566a > 0) {
                if (i != 0) {
                    i2 = this.mMatchList.get(i - 1).b;
                }
                list.add(new SpannableString(str.substring(i2, dVar.f8566a)));
            }
            xmd l = gq0.l();
            if (l != null) {
                v2s.o().n().load(l.a(dVar.d)).b(new a(dVar, list, str, i)).a();
                return;
            }
            list.add(new SpannableString(dVar.c));
            generateStickerByIndex(str, list, i + 1);
        }
    }

    private void generateStickerKMP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87de9237", new Object[]{this, str});
            return;
        }
        this.mMatchList = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if ('[' == charAt) {
                i2 = i3;
            } else if (']' == charAt && i2 >= 0 && this.mEmojiManager != null) {
                int i4 = i3 + 1;
                String substring = str.substring(i2, i4);
                TaoLiveKtEmojiIconItem matchedEmoji = this.mEmojiManager.matchedEmoji(substring);
                if (matchedEmoji != null) {
                    i++;
                    d dVar = new d();
                    dVar.f8566a = i2;
                    dVar.b = i4;
                    dVar.c = substring;
                    dVar.d = matchedEmoji.getThumbnail();
                    this.mMatchList.add(dVar);
                }
                i2 = -1;
            }
        }
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            this.mSpannableContent = arrayList;
            generateStickerByIndex(str, arrayList, 0);
            if (!this.mSpannableContent.isEmpty()) {
                for (SpannableString spannableString : this.mSpannableContent) {
                    append(spannableString);
                }
                setSelection(getText().length());
                return;
            }
            setText("");
            return;
        }
        append(str);
        setSelection(getText().length());
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mIconHeight = hw0.b(getContext(), 15.0f);
        setLongClickable(true);
    }

    public static /* synthetic */ Object ipc$super(PasteEditText pasteEditText, String str, Object... objArr) {
        if (str.hashCode() == -181800469) {
            return new Boolean(super.onTextContextMenuItem(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/view/PasteEditText");
    }

    private void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new b(this));
        addTextChangedListener(new c());
    }

    private void onTextPaste() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7634e", new Object[]{this});
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (!(clipboardManager == null || clipboardManager.getPrimaryClip() == null)) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip != null) {
                for (int i = 0; i < primaryClip.getItemCount(); i++) {
                    ClipData.Item itemAt = primaryClip.getItemAt(i);
                    if (itemAt.getText() != null) {
                        String charSequence = itemAt.getText().toString();
                        o3s.a("ClipData", "Text content: " + charSequence);
                        if (!TextUtils.isEmpty(charSequence)) {
                            generateStickerKMP(charSequence);
                            setSelection(getText().length());
                            this.mRecentlyPasteText = charSequence;
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (giv.f() != null) {
            giv.f().m(this.mFrameContext, "CommentBox_Bubbles", new HashMap());
        }
    }

    public String getRecentlyPasteText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b529ed7", new Object[]{this});
        }
        return this.mRecentlyPasteText;
    }

    public void onResume() {
        ClipData.Item itemAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && itemAt.getText() != null) {
                String charSequence = itemAt.getText().toString();
                this.mClipText = charSequence;
                if (charSequence.length() < 10) {
                    this.mClipText = "";
                }
            }
        } catch (Exception e) {
            o3s.b("PasteEditText", e.getMessage());
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f529f1eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        onTextPaste();
        return true;
    }

    public void resetPasteText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacd15d8", new Object[]{this});
        } else {
            this.mRecentlyPasteText = null;
        }
    }

    public void setEmojiManager(ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a743d5", new Object[]{this, iTaoLiveKtEmojiManager});
        } else {
            this.mEmojiManager = iTaoLiveKtEmojiManager;
        }
    }

    public void setFrameContext(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        } else {
            this.mFrameContext = ux9Var;
        }
    }

    public PasteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PasteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public PasteEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
