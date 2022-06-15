package homeWork5_OOP1_ConstructorsAndClasses;

public class BillCalculation {

    private double spendGB;
    private double localMinutes;
    private double sms;
    private double foreignMinutesZoneOne;
    private double foreignMinutesZoneTwo;
    private double tax = 1.07;

    public BillCalculation(double spendGB, double localMinutes, double sms,
                           double foreignMinutesZoneOne, double foreignMinutesZoneTwo) {
        this.spendGB = spendGB;
        this.localMinutes = localMinutes;
        this.sms = sms;
        this.foreignMinutesZoneOne = foreignMinutesZoneOne;
        this.foreignMinutesZoneTwo = foreignMinutesZoneTwo;
    }

    private double internetCost(double spendGB) {
        double tariffCost = 200;
        double extraPrice;
        if (spendGB > 8) {
            double extraMb = (spendGB - 8) * 1024;
            double countParts = extraMb / 500;
            if (countParts % 0.5 != 0) {
                double countRemains = Math.ceil(countParts);
                extraPrice = countRemains * 50;
            } else {
                extraPrice = countParts * 50;
            }
            tariffCost = tariffCost + extraPrice;
        }
        return tariffCost;
    }
//2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75

    private double callCost(double minutes) {
        double priceForCalls = minutes * 0.5;
        if (minutes >= 500) {
            priceForCalls = 500 * 0.5 + (minutes - 500) * 0.75;
        }
        return priceForCalls;
    }

    //3. Смс до 50 шт 1 грн после 1,50

    private double smsCost(double sms) {
        double priceForSms = sms * 1;
        if (sms >= 50) {
            priceForSms = 50 + (sms - 50) * 1.5;
        }
        return priceForSms;
    }

//4. Звонки за рубеж зона 1 1.5 грн/мин

    private double foreignCallCost_ZoneOne(double minutes) {
        return minutes * 1.5;
    }

//5. Звонки за рубеж зона 2 2 грн/мин

    private double foreignCallCost_ZoneTwo(double minutes) {
        return minutes * 2;
    }

//    После подсчёта суммы добавляется налог 7 %

    public double getPhoneBill() {
        return (internetCost(this.spendGB) + callCost(this.localMinutes) + smsCost(this.sms)
                + foreignCallCost_ZoneOne(this.foreignMinutesZoneOne)
                + foreignCallCost_ZoneTwo(this.foreignMinutesZoneTwo)) * this.tax;
    }
}
