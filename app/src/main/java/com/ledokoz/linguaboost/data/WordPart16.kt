package com.ledokoz.linguaboost.data

import com.ledokoz.linguaboost.data.model.Word

object WordPart16 {
    val words = listOf(
        Word(original = "Kalb", translation = "calf", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Schwein", translation = "pig", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Schaf", translation = "sheep", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Ziege", translation = "goat", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Pferd", translation = "horse", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Pony", translation = "pony", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Esel", translation = "donkey", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Maultier", translation = "mule", languageCode = "DE", category = "AnimalsPets"),
        
        // Wild Animals - Mammals
        Word(original = "Löwe", translation = "lion", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Tiger", translation = "tiger", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Elefant", translation = "elephant", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Giraffe", translation = "giraffe", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Affe", translation = "monkey", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Gorilla", translation = "gorilla", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Bär", translation = "bear", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Wolf", translation = "wolf", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Fuchs", translation = "fox", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Hirsch", translation = "deer", languageCode = "DE", category = "AnimalsPets"),
        
        // Marine Animals
        Word(original = "Wal", translation = "whale", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Delfin", translation = "dolphin", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Hai", translation = "shark", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Robbe", translation = "seal", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Seekuh", translation = "manatee", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Orca", translation = "killer whale", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Narwal", translation = "narwhal", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Beluga", translation = "beluga whale", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Seelöwe", translation = "sea lion", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Walross", translation = "walrus", languageCode = "DE", category = "AnimalsPets"),
        
        // Insects and Arthropods
        Word(original = "Biene", translation = "bee", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Schmetterling", translation = "butterfly", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Käfer", translation = "beetle", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Spinne", translation = "spider", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Ameise", translation = "ant", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Grashüpfer", translation = "grasshopper", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Heuschrecke", translation = "locust", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Libelle", translation = "dragonfly", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Mücke", translation = "mosquito", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Fliege", translation = "fly", languageCode = "DE", category = "AnimalsPets"),
        
        // Animal Characteristics and Behaviors
        Word(original = "Pelz", translation = "fur", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Federn", translation = "feathers", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Schuppen", translation = "scales", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Krallen", translation = "claws", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Hörner", translation = "horns", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Stacheln", translation = "spines", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Rüssel", translation = "trunk", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Schwanz", translation = "tail", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Schnabel", translation = "beak", languageCode = "DE", category = "AnimalsPets"),
        Word(original = "Kiemen", translation = "gills", languageCode = "DE", category = "AnimalsPets"),
        
        // Office & Business Category - 200 specialized professional and corporate terms
        Word(original = "Unternehmen", translation = "company/business", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Konzern", translation = "corporation/conglomerate", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Start-up", translation = "start-up", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Joint Venture", translation = "joint venture", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Tochtergesellschaft", translation = "subsidiary", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Muttergesellschaft", translation = "parent company", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Aktiengesellschaft", translation = "public limited company", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "GmbH", translation = "limited liability company", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "UG", translation = "entrepreneurial company", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Einzelunternehmen", translation = "sole proprietorship", languageCode = "DE", category = "OfficeBusiness"),
        
        // Corporate Leadership and Management
        Word(original = "Geschäftsführung", translation = "management/executive board", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Vorstandsvorsitzender", translation = "CEO/chairman of the board", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Chief Executive Officer", translation = "chief executive officer", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Geschäftsführer", translation = "managing director", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Abteilungsleiter", translation = "department head", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Teamleiter", translation = "team leader", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Projektmanager", translation = "project manager", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Personalabteilung", translation = "human resources department", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Finanzabteilung", translation = "finance department", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Marketingabteilung", translation = "marketing department", languageCode = "DE", category = "OfficeBusiness"),
        
        // Office Infrastructure and Facilities
        Word(original = "Bürogebäude", translation = "office building", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Bürokomplex", translation = "office complex", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Coworking Space", translation = "coworking space", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Homeoffice", translation = "home office", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Virtuelles Büro", translation = "virtual office", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Büromöbel", translation = "office furniture", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Arbeitsplatz", translation = "workspace", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Besprechungsraum", translation = "conference room", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Meetingraum", translation = "meeting room", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Videokonferenzraum", translation = "video conference room", languageCode = "DE", category = "OfficeBusiness"),
        
        // Business Communications
        Word(original = "E-Mail", translation = "email", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Videoanruf", translation = "video call", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Telefonkonferenz", translation = "teleconference", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Webinar", translation = "webinar", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Newsletter", translation = "newsletter", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Pressemitteilung", translation = "press release", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Corporate Identity", translation = "corporate identity", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Branding", translation = "branding", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Public Relations", translation = "public relations", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Kundenbetreuung", translation = "customer service", languageCode = "DE", category = "OfficeBusiness"),
        
        // Financial and Accounting Terms
        Word(original = "Bilanz", translation = "balance sheet", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Jahresabschluss", translation = "annual financial statement", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Gewinn und Verlust", translation = "profit and loss", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Cashflow", translation = "cash flow", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Liquidität", translation = "liquidity", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Investition", translation = "investment", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Kapital", translation = "capital", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Eigenkapital", translation = "equity", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Fremdkapital", translation = "debt capital", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Rendite", translation = "return on investment", languageCode = "DE", category = "OfficeBusiness"),
        
        // Marketing and Sales
        Word(original = "Vertrieb", translation = "sales/distribution", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Marketingstrategie", translation = "marketing strategy", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Werbeaktion", translation = "advertising campaign", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Social Media Marketing", translation = "social media marketing", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Content Marketing", translation = "content marketing", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Suchmaschinenoptimierung", translation = "search engine optimization", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Conversion Rate", translation = "conversion rate", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Lead-Generierung", translation = "lead generation", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Kundengewinnung", translation = "customer acquisition", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Umsatz", translation = "revenue/sales turnover", languageCode = "DE", category = "OfficeBusiness"),
        
        // Human Resources and Employment
        Word(original = "Personalwesen", translation = "human resources", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Rekrutierung", translation = "recruitment", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Stellenangebot", translation = "job posting", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Bewerbungsgespräch", translation = "job interview", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Arbeitsvertrag", translation = "employment contract", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Probezeit", translation = "probation period", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Weiterbildung", translation = "continuing education", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Schulung", translation = "training", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Performance Review", translation = "performance review", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Karriereentwicklung", translation = "career development", languageCode = "DE", category = "OfficeBusiness"),
        
        // Project Management and Operations
        Word(original = "Projektplanung", translation = "project planning", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Meilenstein", translation = "milestone", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Deadline", translation = "deadline", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Ressourcenplanung", translation = "resource planning", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Budgetplanung", translation = "budget planning", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Qualitätsmanagement", translation = "quality management", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Risikomanagement", translation = "risk management", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Lieferkette", translation = "supply chain", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Logistik", translation = "logistics", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Betriebsoptimierung", translation = "operational optimization", languageCode = "DE", category = "OfficeBusiness"),
        
        // Legal and Compliance
        Word(original = "Compliance", translation = "compliance", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Datenschutz", translation = "data protection", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Wettbewerbsrecht", translation = "competition law", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Arbeitsrecht", translation = "labor law", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Vertragsrecht", translation = "contract law", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Steuerberatung", translation = "tax consulting", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Wirtschaftsprüfung", translation = "auditing", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Revisionsstelle", translation = "audit firm", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Rechtsschutz", translation = "legal protection", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Haftung", translation = "liability", languageCode = "DE", category = "OfficeBusiness"),
        
        // International Business
        Word(original = "Export", translation = "export", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Import", translation = "import", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Internationalisierung", translation = "internationalization", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Globalisierung", translation = "globalization", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Markteintritt", translation = "market entry", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Lizenzvertrag", translation = "licensing agreement", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Franchise", translation = "franchise", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Joint Venture", translation = "joint venture", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Tochtergesellschaft", translation = "subsidiary", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Niederlassung", translation = "branch office", languageCode = "DE", category = "OfficeBusiness"),
        
        // Technology and Innovation
        Word(original = "Digitalisierung", translation = "digitalization", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Innovation", translation = "innovation", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Forschung und Entwicklung", translation = "research and development", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Patent", translation = "patent", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Geistiges Eigentum", translation = "intellectual property", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Technologie Transfer", translation = "technology transfer", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Startup-Finanzierung", translation = "startup financing", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Venture Capital", translation = "venture capital", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Business Angel", translation = "business angel", languageCode = "DE", category = "OfficeBusiness"),
        Word(original = "Crowdfunding", translation = "crowdfunding", languageCode = "DE", category = "OfficeBusiness")
    )
}
