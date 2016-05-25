package io.duniter.app.model.EntityWeb;

import android.content.Context;

import io.duniter.app.model.Entity.Currency;
import io.duniter.app.model.services.WebService;

/**
 * Created by naivalf27 on 19/04/16.
 */
public class MemberWeb extends Web{
    private Currency currency;

    public MemberWeb(Context context, Currency currency) {
        super(context);
        this.currency = currency;
    }

    @Override
    public String getUrl() {
        return "http://" + WebService.getServeur(context,currency) + "/wot/members";
    }

    @Override
    public String postUrl() {
        return null;
    }
}
